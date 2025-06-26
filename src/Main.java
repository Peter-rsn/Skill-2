import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {



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
        /*Scanner mujScanner = new Scanner(System.in);
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
        }*/

//Pole
int[] znamky = new int[5];
znamky [0] = 3;
znamky [1] = 5;
znamky [3] = 1;
znamky [4] = 2;

          /*String[] jmena = new String[30];
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej pozici ke zmene(max 29)");
        int poziceZmeny = mujScanner.nextInt();
        mujScanner.nextLine();
        System.out.println("Zadej jmeno:");
        String jmeno = mujScanner.nextLine();

        jmena[poziceZmeny] = jmeno;
        System.out.println(jmena[poziceZmeny]);*/

        /*String[] jmena = new String[] {"Jan", "Petr", "Katka", "Jana"};
        jmena[0] = "jmeno";
        System.out.println(jmena);*/

        /*int[][][] pole2D = new int[3][3][5];
        pole2D[0][0][0] = 464;
        pole2D[0][1][0] = -92;*/

//Smycky
        /*for(int i = 0; i < 10; i++){
            //System.out.println(i * 5);
            if(i == 5){
                //break;
                continue;
            }
            System.out.println(i);
        }*/

        /*String[] jmena = new String[] {"Jan", "Petr", "Katka", "Jana"};

        //for
        for(int i = 0; i < jmena.length; i++){
            System.out.println(jmena[i]);
        }

        //foreach
        for(String jmeno: jmena){
            System.out.println(jmeno);
        }*/

//while
        /*int ridiciPromenna = 0;
        while (ridiciPromenna < 5){
            System.out.println(ridiciPromenna);
            ridiciPromenna++;
        }
        System.out.println("Tady pokracuju");*/

//do...while (provede se mi minimalne jednou bez ohledu na podminku
        /*int ridiciPromenna2 = 0;
        do {
            System.out.println(ridiciPromenna2);
            ridiciPromenna2++;
        } while(ridiciPromenna2 < 5);

        System.out.println("Tady pokracuju");*/

//Vylepseni ulohy hod kostkami
        /*int hozeneCislo;
        Random nahodnyGenerator = new Random();
        Scanner mujScanner = new Scanner(System.in);
        boolean ridiciPromenna = true;
        String ukonceni;

        do {
            System.out.println("Pro hozeni kostkou stiskni enter");
            mujScanner.nextLine();

            hozeneCislo = nahodnyGenerator.nextInt(1, 7);
            System.out.println("Hozene cislo je: " + hozeneCislo);

            if (hozeneCislo % 2 == 1) {
                System.out.println("Licha - Vyhravas!");
            } else {
                System.out.println("Suda - Prohravas");
            }

            System.out.println("Pro ukonceni hry zadej pismeno q");
            ukonceni = mujScanner.nextLine();
            if(ukonceni.equals("q")){
                break;
            }

        } while(ridiciPromenna);*/

//21 (Blackjack)
Scanner mujScanner = new Scanner(System.in);
Random nahGen = new Random();
int skoreHrace = 0;
int skoreKrupiera = 0;
int tazenaKarta;
String uzivatelskyVstup;

        do {
tazenaKarta = nahGen.nextInt(1, 14);
            System.out.println("Tazena karta je: " + tazenaKarta);
skoreHrace = skoreHrace + tazenaKarta;
            System.out.println("Skore hrace je: " + skoreHrace);

            if(skoreHrace > 21){
        System.out.println("Prohral jsi!");
                break;
                        }

                        System.out.println("Chces dalsi kartu stiskni - d");
            System.out.println("Uz nechces kartu stiskni - q");
uzivatelskyVstup = mujScanner.nextLine();

            if(uzivatelskyVstup.equals("d")){
        continue;
        }
        else if(uzivatelskyVstup.equals("q")){
        while (skoreKrupiera < skoreHrace){
skoreKrupiera += nahGen.nextInt(1, 14);
                }
                        break;
                        }


                        }while(true);

                        System.out.println("Skore hrace: " + skoreHrace);
        System.out.println("Skore krupiera: " + skoreKrupiera);

        if((skoreHrace > skoreKrupiera && skoreHrace <= 21) || skoreKrupiera > 21){
        System.out.println("Vyhral jste");
        }else if(skoreKrupiera == skoreHrace){
        System.out.println("Je to remiza");
        }
                else {
                System.out.println("Prohral jste");
        }

                System.out.println("Dekujeme za hru");


RodinnyDom domNovakovych = new RodinnyDom();
domNovakovych.pocetPoschodi = 4;
domNovakovych.rozloha = 457f;
domNovakovych.material = "mramor";



}

}

