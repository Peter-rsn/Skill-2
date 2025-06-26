import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello, World!");

        String pozdrav = "Peter";

        System.out.printf(pozdrav);
        System.out.printf(pozdrav);
        System.out.printf(pozdrav);
        System.out.printf(pozdrav);

        int prveCislo = 5;
        int druheCislo = 10;


        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(druheCislo / prveCislo);
        System.out.println(prveCislo * druheCislo);

        String pozdrav2 = "Ahoj";
        String meno = "Peter";
        System.out.println(pozdrav2 + " " + meno);

        //Uloha uzivatel napise svoje meno a program ho pozdravi
        /*String pozdrav3 = "Ahoj, ";
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadaj svoje meno:");
        String meno = mujScanner.nextLine();
        System.out.println((pozdrav + meno);*/

        //Kalkulacka
        int prveCislo1;
        int druheCislo2;


       /* Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadaj prve cislo:");
        prveCislo = mujScanner.nextInt();

        System.out.println("Zadaj druhe cislo:");
        prveCislo = mujScanner.nextInt();

        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo / druheCislo);
        System.out.println(prveCislo * druheCislo);*/

        //Uzivatel zada slovo, vo vypise budu vsetky pismena velke
        /*Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadaj svoje slovo:");
        String slovo = mujScanner.nextLine();

        System.out.println(slovo.contains("el"));*/




         //Feature pre kontrolu veku, bude mat uzivatel 18 a viac vypis do konzoly vitaj v aplikacii
        /*int vek;
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadaj svoj vek:");

        vek = mujScanner.nextInt();

        if(vek >= 18 && vek < 65) {
            System.out.println("Uzivatel je dospely");
        }
        else if (vek >= 65){
            System.out.println("Uzivatel je senior");


        }

        else if(vek >= 0 && vek < 18){
            System.out.println("Uzivatel je neplnolety");
        }
        else {
            System.out.println("Nejde zadat zaporny vek");

        }*/

        //Vypocet BMI hmotnost/vyska na druhu
        // (<18.5) - nadvaha
        // (>18.5 && < 25) - optimalna vaha
        // (>=25) - nadvaha
         /*float vyska;
         float hmotnost;
         float bmi;
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadaj vysku");
        vyska = mujScanner.nextFloat();
        System.out.println("Zadaj hmotnost");
        hmotnost = mujScanner.nextFloat();
        bmi = hmotnost / (vyska * vyska);

        if(bmi < 18.5f) {
            System.out.println("Uzivatel na podvahu");
        }
        else if(bmi>18.5f && bmi<25){
            System.out.println("Uzivatel na optimalnu vahu");
        }

        else if(bmi>=25) {
            System.out.println("Uzivatel ma nadvahu");
        }

        System.out.println(bmi);*/

      // parne cislo = vyhrava, neparne cislo =  nevyhrava
        /*int hodeneCislo;
        Random nahodnyGenerator = new Random();

        hodeneCislo = nahodnyGenerator.nextInt(1,7);
        System.out.println("Hodene cislo je:" + hodeneCislo);

        if (hodeneCislo % 2 == 1 ) {
            System.out.println("Parna - Vyhravas!");
        }
        else {
            System.out.println("Neparna - Prehravas");*/

        // Switch - den v tyzdni
        Scanner mujScanner = new Scanner(System.in);
        int cisloDna;
        System.out.println("Zadaj cislo dna");
        cisloDna = mujScanner.nextInt();
        switch (cisloDna){
            case 1:
                System.out.println("Je pondelok");
                break;
            case 2:
                System.out.println("Je utorok");
                break;
            case 3:
                System.out.println("Je streda");
                break;
            case 4:
                System.out.println("Je stvrtok");
                break;
            case 5:
                System.out.println("Je piatok");
                break;
            case 6:
                System.out.println("Je sobota");
                break;
            case 7:
                System.out.println("Je nedela");
                break;
        }



    }
}