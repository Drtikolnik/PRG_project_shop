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
            String stavString = sc.nextLine().toLowerCase();
            Condition stav = Condition.valueOf(stavString);


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
                case Condition.good:
                    car.printInfo();
                    System.out.println();
                    break;

            }
        }
    }

    public void printCarWithMostPocetKm(){
        System.out.println("Auto s nejvíce najetými km: ");
        Car carWithMostPocetKm = null;
        int nejvicPocetKm = 0;

        for (Car car : cars){
            if (car.getPocetKm() < nejvicPocetKm){
                nejvicPocetKm = car.getPocetKm();
                carWithMostPocetKm = car;
            }
        }

        if (carWithMostPocetKm != null){
            System.out.print("Barva:" + carWithMostPocetKm.getBarva());
            System.out.print(" - Kilometry: " + carWithMostPocetKm.getPocetKm());
        }else{
            System.out.println("V databázi nejsou zadna auta.");
        }
    }

    //dodělat úkol8 a dál - opravit cndition
    public void printInterestingFacts(){
        System.out.println("Zajimave fakty:");
        System.out.println("Pocet aut: " + cars.length);
        System.out.println("jméno vlastníka: " +owner);
        System.out.println("délka jména vlastníka: " +owner.length());
        System.out.println("První písmenko tohoto jmeéna: " +owner.charAt(0));

        boolean hasDamagedCars = false;
        for (Car car: cars){
            if (car.getStav() == Condition.damaged){
                hasDamagedCars = true;
            }
        }

        if (hasDamagedCars) {
            System.out.println("Nektere z aut je nabourane");
        } else {
            System.out.println("Vsechna auta jsou v poradku.");
        }


    }








}

