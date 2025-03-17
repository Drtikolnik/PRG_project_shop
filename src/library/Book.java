package library;

import bookstore.Zanr;

public class Book{

    private String nazev;
    private String jmenoAutora;
    private int pocetStran;

    public String getNazev() { return nazev; }
    public String getJmenoAutora() { return jmenoAutora; }
    public int getPocetStran() { return pocetStran; }

    //KONSTRUKTOR
    public Book(String nazev, String jmenoAutora, int pocetStran) {
        this.nazev = nazev;
        this.jmenoAutora = jmenoAutora;
        this.pocetStran = pocetStran;
    }

    //PRINT
    public void printInfo(){
        System.out.println("Kniha s názvem: " +nazev+ " má " +pocetStran+ " stran a napsal ji " +jmenoAutora);
    }

    //PRINT DÉLKA
    public void printDelka(){
        System.out.println("Kniha má " +pocetStran+ " stran. ");
    }



}
