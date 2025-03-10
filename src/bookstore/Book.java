package bookstore;


import elektroshop.Narocnost;

public class Book {
    private String nazev;
    private int rokVydani;
    private int pocetStran;
    private Zanr zanr;

    public String getNazev() {return nazev;}
    public int getRokVydani() {return rokVydani;}
    public int getPocetStran() {return pocetStran;}
    public Zanr getZanr() { return zanr;}

    //KONSTRUKTOR
    public Book(String nazev, int rokVydani, int pocetStran, Zanr zanr) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.pocetStran = pocetStran;
        this.zanr = zanr;
    }

    public void printInfo(){
        System.out.print(nazev+ " : ");
        switch(zanr){
            case roman -> System.out.print("Román");
            case scifi -> System.out.print("Scifi");
            case detektivka -> System.out.print("Detektivka");
            default -> System.out.print("n/a");
        }
        System.out.print(" : " +rokVydani+ " ; " );
    }
















}
