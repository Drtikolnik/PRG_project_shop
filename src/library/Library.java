package library;

import bookstore.Zanr;
import java.util.Scanner;

public class Library {
	static Scanner sc = new Scanner(System.in);

	private Book[] items;
	private Magazine[] magazines;

	public void addItems(int count, int count2) {
		magazines = new Magazine[count2];
		for (int i=0; i<count2; i++){
			System.out.println("Jaký je název časopisu?");
			String nazev = sc.nextLine();
			System.out.println("Jaké je jméno redakce časopisu?");
			String jmenoRedakce = sc.nextLine();
			System.out.println("Jaký je počet stran časopisu?");
			int pocetStran = sc.nextInt();
			sc.nextLine();

			magazines[i] = new Magazine(nazev, jmenoRedakce, pocetStran);
		}

		items = new Book[count];
		for (int i=0; i<count; i++){
			System.out.println("Jaký je název knihy?");
			String nazev = sc.nextLine();
			System.out.println("Jaké je jméno autora knihy?");
			String jmenoAutora = sc.nextLine();
			System.out.println("Jaký je počet stran knihy?");
			int pocetStran = sc.nextInt();
			sc.nextLine();

			items[i] = new Book(nazev, jmenoAutora, pocetStran);
		}
	}




	public void printInfo(){
		//PRINT INFO KNIHY
		System.out.println("-----INFO O KNIHOVNE-----");
		for(Book book : items){
			book.printInfo();
		}
		//PRINT INFO ČASOPISŮ
		for(Magazine magazine : magazines){
			magazine.printInfo();
		}
		System.out.println("-----");
	}
}
