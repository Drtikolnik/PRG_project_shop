package autosaloon;
import java.util.Scanner;

public class Car {
    static Scanner sc = new Scanner(System.in);

    private String rokVyroby;
    private int pocetKm;
    private String barva;
    private Condition stav;

    public Car(String rokVyroby, int pocetKm, String barva, Condition stav) {
        this.rokVyroby = rokVyroby;
        this.pocetKm = pocetKm;
        this.barva = barva;
        this.stav = stav;
    }

    public void printInfo(){
        System.out.println("Rok Vyroby: " +rokVyroby+ "Pocet Km: " +pocetKm+ "Barva: " +barva+ "Stav: " + stav);
    }

    public String getRokVyroby() {return rokVyroby;}
    public int getPocetKm() {return pocetKm;}
    public String getBarva() {return barva;}
    public Condition getStav() {return stav;}


	
}

