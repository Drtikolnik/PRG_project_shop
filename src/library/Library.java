package library;

import bookstore.Zanr;
import java.util.Scanner;

public class Library {
	static Scanner sc = new Scanner(System.in);

	private Book[] items;

	public void addItems(int count) {
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
		System.out.println("-----INFO O KNIHOVNE-----");
		for(Book book : items){
			book.printInfo();
		}
		System.out.println("-----");
	}
}
