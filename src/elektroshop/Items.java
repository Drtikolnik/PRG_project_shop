package elektroshop;

import autosaloon.Car;
import autosaloon.Condition;

import java.util.Scanner;

public class Items {
    static Scanner sc = new Scanner(System.in);

    private Fridge[] items;


    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu ledniček. A ty prida do pole items.
     * @param count - pozadovany pocet lednicek
     */
    public void addItems(int count) {
        items = new Fridge[count];
        for (int i=0; i<count; i++){
            System.out.println("Jaký je rok výroby ledničky?");
            int rokVyroby = sc.nextInt();
            sc.nextLine();
            System.out.println("Jaká je značka ledničky?");
            String znacka = sc.nextLine();
            System.out.println("Jaký je model ledničky?");
            String model = sc.nextLine();
            System.out.println("Jaká je energetická náročnost ledničky? - (A, B, C, D, E, F, G)");
            String narocnostString = sc.nextLine().toUpperCase();
            Narocnost narocnost = Narocnost.valueOf(narocnostString);

            items[i] = new Fridge(rokVyroby, narocnost, znacka, model);
        }

    }


    /**
     * Tato metoda vypise informace o lednickach. Na prvnim rádku bude text "-----INFO O LEDNICKACH----- ",
     * na dalsich radkach bude vzdy rok vyroby lednick, dvojtecka a popis spotreby. (Vyuzijte metodu printInfo() tridy Fridge.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O LEDNICKACH-----");
        Fridge.printInfo();
        System.out.println("-----");
    }
}













