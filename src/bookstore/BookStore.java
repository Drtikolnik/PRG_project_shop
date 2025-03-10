package bookstore;

import java.util.Scanner;

public class BookStore {
    static Scanner sc = new Scanner(System.in);

    private String name;
    private Book[] books;
    private int nejkratsi;

    public BookStore(String name) {
        this.name = name;
    }

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu knih. A ty prida do pole knih.
     */
    public void addBoooks() {
        System.out.println("Kolik knih chceš zadat?");
        int count = sc.nextInt();
        sc.nextLine();
        books = new Book[count];
        for (int i=0; i<count; i++){
            System.out.println("Jaký je název knihy?");
            String nazev = sc.nextLine();
            System.out.println("Jaký je rok vydání knihy?");
            int rokVydani = sc.nextInt();
            sc.nextLine();
            System.out.println("Jaký je počet stran knihy?");
            int pocetStran = sc.nextInt();
            sc.nextLine();
            System.out.println("Jaký je žánr knihy? - (Román [bez diakritiky], Scifi, Detektivka)");
            String zanrString = sc.nextLine().toLowerCase();
            Zanr zanr = Zanr.valueOf(zanrString);

            books[i] = new Book(nazev, rokVydani, pocetStran, zanr);
        }
    }


    /**
     * Tato metoda vypise informace o knihach. Na prvnim rádku bude text "-----INFO O KNIHKUPECTVI----- ", na druhem bude název KNIHKUPECTVI a tecka.
     * Na tretim radku bude text "na sklade mame tyto knihy:" a následne budou vypsany vsichny knihy oddelene od sebe stredniken a to ve formátu "nazev : zanr : rok vydani" (Vyuzijte metodu printInfo() tridy Book.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O KNIHKUPECTVI-----");
        System.out.println(name+ ".");
        System.out.print("Na skladně máme tyto knihy:" );
        for(Book book : books){
            book.printInfo();
        }
        System.out.println("");
        System.out.println("-----");
    }

    public void printPocetStranNejkratsi(){
        for(Book book : books){
            if(book.getPocetStran() > nejkratsi){
                nejkratsi = book.getPocetStran();
            }
        }
        for(Book book : books){
            if(book.getPocetStran() < nejkratsi){
                nejkratsi = book.getPocetStran();
            }
        }

        System.out.println("Počet stran nejkratší knihy: " + nejkratsi);
    }









}
