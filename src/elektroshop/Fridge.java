package elektroshop;
import autosaloon.Condition;

import java.util.Scanner;

public class Fridge {
    static Scanner sc = new Scanner(System.in);

    private int rokVyroby;
    private Narocnost narocnost;
    private String znacka;
    private String model;

    public Fridge(int rokVyroby, Narocnost narocnost, String znacka, String model) {
        this.rokVyroby = rokVyroby;
        this.narocnost = narocnost;
        this.znacka = znacka;
        this.model = model;
    }

    public int getRokVyroby() {return rokVyroby;}
    public Narocnost getNarocnost() { return narocnost;}
    public String getZnacka() {return znacka;}
    public String getModel() {return model;}

    public void printInfo(){
        System.out.print(rokVyroby+ " : " );
        switch(narocnost){
            case A -> System.out.print("very low");
            case B -> System.out.print("low");
            case C -> System.out.print("normal");
            case D -> System.out.print("above normal");
            case E -> System.out.print("high");
            case F -> System.out.print("very high");
            case G -> System.out.print("extremely high");

        }
    }











}





































