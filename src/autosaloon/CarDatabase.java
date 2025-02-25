package autosaloon;

import java.util.Scanner;

public class CarDatabase {
    static Scanner sc = new Scanner(System.in);

    String owner;
    Car[] cars;

    public CarDatabase(String owner) {
        this.owner = owner;
    }

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu aut. A ty prida do pole aut.
     * @param count - pozadovany pocet aut
     */



    public void addCars(int count) {
        cars = new Car[count];
        for (int i=0; i<count; i++){
            System.out.println("Jaký je rok výroby auta?");
            String rokVyroby = sc.nextLine();
            System.out.println("Jaký je počet najetých km?");
            int pocetKm = sc.nextInt();
            sc.nextLine();
            System.out.println("Jaká je brava auta?");
            String barva = sc.nextLine();
            System.out.println("Jaký je stav auta? - (EXCELLENT, GOOD, DAMAGED, BAD)");
            String stav = sc.nextLine().toLowerCase();
            Condition stavCondition = Condition.valueOf(stav);


            cars[i] = new Car(rokVyroby, pocetKm, barva, stav);

            //nacti od uzivatele rok vyroby, pocet najetych km, barvu a stav auta
            //vytvor instanci auta - nutno upravit i tridu Car, chceme instanci nastavit atributy na nactene hodnoty od uzivatele
            //pridej auto do pole aut
        }

    }


    /**
     * Vypise vsechna auta, jejijz stav je "good". Vypis bude ve formatu: Na prvnim radku bude vypis: Dobra auta jsou: .
     * Na kazdem dalsim radku bude vypis informaci o jednom aute - pouzij metodu printInfo() tridy Car
     */
    public void printCarInGoodCondition(){
        System.out.println("Dobra auta jsou");
        for (Car car : cars){
            switch(car.getStav()) {
                case "good":
                    car.printInfo();
                    System.out.println();
                    break;

            }
        }


    }
}

