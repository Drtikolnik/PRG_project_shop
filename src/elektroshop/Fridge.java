package elektroshop;
import autosaloon.Condition;

import java.util.Scanner;

public class Fridge {
    static Scanner sc = new Scanner(System.in);

    private int rokVyroby;
    private Narocnost narocnost;
    private String znacka;
    private String model;

    public int getRokVyroby() {return rokVyroby;}
    public Narocnost getNarocnost() { return narocnost;}
    public String getZnacka() {return znacka;}
    public String getModel() {return model;}

    public Fridge(int rokVyroby, Narocnost narocnost, String znacka, String model) {
        this.rokVyroby = rokVyroby;
        this.narocnost = narocnost;
        this.znacka = znacka;
        this.model = model;
    }

    //tato metoda se používá v Items v printInfo
    public void printInfo(){
        System.out.print(rokVyroby+ " : " );
        switch(narocnost){
            case A -> System.out.println("very low");
            case B -> System.out.println("low");
            case C -> System.out.println("normal");
            case D -> System.out.println("above normal");
            case E -> System.out.println("high");
            case F -> System.out.println("very high");
            case G -> System.out.println("extremely high");
            default -> System.out.println("n/a");
        }
    }











}





































