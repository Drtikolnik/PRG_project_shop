package library;

public class Magazine implements IItem{

    private String nazev;
    private String jmenoRedakce;
    private int pocetStran;

    public String getNazev() { return nazev; }
    public String getJmenoRedakce() { return jmenoRedakce; }
    public int getPocetStran() { return pocetStran; }

    //KONSTRUKTOR
    public Magazine( String nazev, String jmenoRedakce , int pocetStran ) {
        this.nazev = nazev;
        this.jmenoRedakce = jmenoRedakce;
        this.pocetStran = pocetStran;
    }

    //PRINT
    public void printInfo(){
        System.out.println("Magazín s názvem " +nazev+ " má " +pocetStran+ " a vydala ho redakce " +jmenoRedakce);
    }

    //PRINT DÉLKA
    public void printDelka(){
        System.out.println("Kniha má " +pocetStran+ " stran. ");
    }




}
