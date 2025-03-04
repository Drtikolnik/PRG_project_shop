package elektroshop;

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
        for(Fridge fridge : items){
            fridge.printInfo();
        }
        System.out.println("-----");
    }

    public void printNarcnostA(){
        System.out.println("Ledničky s náročností A jsou:");
        for (Fridge fridge : items){
            switch(fridge.getNarocnost()) {
                case Narocnost.A ->
                    fridge.printInfo();
                default ->
                    System.out.println("0");
            }

        }
    }

    public void printPocetPolozek(){
        System.out.println("Počet položek:");
        System.out.println(items.length);
    }

    public void printZajimavosti(){
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        for (Fridge fridge : items){
            switch(fridge.getNarocnost()) {
                case Narocnost.A ->
                        a++;
                case Narocnost.B ->
                        b++;
                case Narocnost.C ->
                    c++;
                case Narocnost.D ->
                    d++;
                case Narocnost.E ->
                    e++;
                case Narocnost.F ->
                    f++;
                case Narocnost.G ->
                    g++;
            }
        }
        System.out.println("Počet ledniček v jednotlivých náročností");
        System.out.println("A: " +a);
        System.out.println("B: " +b);
        System.out.println("C: " +c);
        System.out.println("D: " +d);
        System.out.println("E: " +e);
        System.out.println("F: " +f);
        System.out.println("G: " +g);
    }

}













