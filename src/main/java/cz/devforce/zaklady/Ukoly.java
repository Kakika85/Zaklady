package cz.devforce.zaklady;

import cz.devforce.zaklady.tridy.Nemovitost;
import cz.devforce.zaklady.tridy.Osoba;

import java.util.ArrayList;
import java.util.Collections;

public class Ukoly {
    public static void main(String[] args) {
        generatorCisel(9, 5);
        vypisClenyRodiny();
        vypisClenyRodiny2();
        vypisJmenaPejsku();
        vypisVetu1();
        vypisFloru();
        vypisFloru2();
        vypisFloru3();
        vypisFloru3_1();
        vypisFloru5();
        vareni();
        numero();
        spojení();
        instanceNemovitosti();
        instanceOsoby();
    }

    /**
     * vytvoř metodu, volanou z  mainu, název si vymysli,aby odpovídal co metoda dělá
     * metoda bude generovat posloupnost čísel
     * - bude možné zadat počáteční číslo
     * - bude možné zadat počet opakování - začni na 9 a pokračuj dalších 5 čísel... čili skočíš na 14
     */

    public static void generatorCisel(int pocatecniHodnota, int pocetOpakovani) {
        for (int i = pocatecniHodnota; i <= pocatecniHodnota + pocetOpakovani; i++) {
            System.out.println(i);
        }

        System.out.println(",,,,,,,");

    }


    /**
     * Vytvoř metodu, která bude for-cyklem procházet pole a vypisovat do konzole, co v tom poli je
     */
    private static final String[] rodina = new String[]{"Jára", "Kája", "Daník", "Anežka", "Domík"};

    public static void vypisClenyRodiny() {
        for (int i = 0; i < rodina.length; i++) {
            System.out.println(rodina[i]);
        }

        System.out.println(",,,,,,,");

        for (String clen : rodina) {
            System.out.printf(clen + ", ");
        }
        System.out.println("");


        System.out.println(",,,,,,,");

        for (String clen : rodina) {
            System.out.println(clen);
        }

        System.out.println(",,,,,,,");

    }


    /**
     * Vypiš cleny rodiny pod sebe...
     */
    public static void vypisClenyRodiny2() {
        var clenove = new ArrayList<String>(); // String[] = ArrayList<String>
        clenove.add("Jára");
        clenove.add("Kája");
        clenove.add("Daník");
        clenove.add("Anežka");
        clenove.add("Domík");

        for (String clen : clenove) {
            System.out.println(clen);
        }

        System.out.println(",,,,,,,");

        for (int i = 0; i < clenove.size(); i++) {
            System.out.println(clenove.get(i));
        }

        System.out.println(",,,,,,,");

    }


    /**
     * Vypiš jména 5ti pejsků cyklem dle uvážení.
     * Vygoogli nejjednodušší způsob, jak to pole před vypsáním seřadit.
     */
    public static void vypisJmenaPejsku() {
        var jmenaPejsku = new ArrayList<String>();

        jmenaPejsku.add("Alík");
        jmenaPejsku.add("Bertík");
        jmenaPejsku.add("Jessie");
        jmenaPejsku.add("Black");
        jmenaPejsku.add("Charlie");

        Collections.sort(jmenaPejsku);

        for (int i = 0; i < jmenaPejsku.size(); i++) {
            System.out.println(jmenaPejsku.get(i));
        }

        System.out.println(",,,,,,,");

    }

    /**
     * Vypiš tato slova: Kájinka je nejlepší!
     * Můžeš ale vypsat jen jedno slovo za každou metodu a volat jen jednu metodu v dané metodě.
     */

    public static void vypisVetu1() {
        System.out.printf("Kajinka ");
        vypisVetu2();
    }

    public static void vypisVetu2() {
        System.out.printf("je ");
        vypisVetu3();

    System.out.println(",,,,,,,");

    }

    public static void vypisVetu3() {
        System.out.println("nejlepší!");
    }

    /**
     * Vytvoř pole stringu se jmény rostlin a stromu, alespoň 10, může být víc. Na všechny způsoby vypsání vyber vhodnou formu cyklu.
     * 1. cyklem projdi pole a vypis pod sebe poradi a jmeno, napr "3. Buk"
     * 2. najdi nejjednodussi zpusob jak seradit pole podle abecedy a vypis "3. strom z 10ti je Buk" (cislo 10 musi odpovidat poctu prvku v poli a nesmi byt napsane natvrdo)
     * 3. najdi zpusob jak seradit pole pozpatku a znovu vypis, tentokrat jen nazev "Buk" a nic vic
     * 3.1. uprav za pomoci googlu vypsani na "Počet znaků ve slově 'Buk': 3"
     * 4. zkus vygooglit jake existuji vsechny standardne pouzivane formy cyklu, zajimaji me pouze klicova slova kterymi se vytvari (tzn bez implementace)
     * 5. vyber si vhodny cyklus, ktery jsi pouzila v predchozich bodech a ukonci ho po vypsani 5ti polozek
     */

    /**
     * 1. úkol - cyklem projdi pole a vypis pod sebe poradi a jmeno, napr "3. Buk"
     */
    private static final String[] rostlinyAStromy = new String[]{"Orchidej", "Lilie", "Růže", "Pampeliška", "Podběl", "Sedmikráska", "Jabloň", "Slivoň", "Hrušeň", "Meruňka", "Ořech"};

    public static void vypisFloru() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i + 1 + ". " + rostlinyAStromy[i]);
        }

        System.out.println(",,,,,,,");

    }

    /**
     * 2. úkol - najdi nejjednodussi zpusob jak seradit pole podle abecedy a vypis "3. strom z 10ti je Buk" (cislo 10 musi odpovidat poctu prvku v poli a nesmi byt napsane natvrdo)
     */
    public static void vypisFloru2() {
        var rostlinyAStromy2 = new ArrayList<String>();

        rostlinyAStromy2.add("Orchidej");
        rostlinyAStromy2.add("Lilie");
        rostlinyAStromy2.add("Růže");
        rostlinyAStromy2.add("Pampeliška");
        rostlinyAStromy2.add("Podběl");
        rostlinyAStromy2.add("Sedmikráska");
        rostlinyAStromy2.add("Jabloň");
        rostlinyAStromy2.add("Slivoň");
        rostlinyAStromy2.add("Hrušeň");
        rostlinyAStromy2.add("Meruňka");
        rostlinyAStromy2.add("Ořech");

        Collections.sort(rostlinyAStromy2);

        for (int i = 0; i < rostlinyAStromy2.size(); i++) {
            System.out.println(i + ". strom z " + rostlinyAStromy2.size() + " " + rostlinyAStromy2.get(i));
        }

        System.out.println(",,,,,,,");

    }

    /**
     * 3. úkol - najdi zpusob jak seradit pole pozpatku a znovu vypis, tentokrat jen nazev "Buk" a nic vic
     */
    public static void vypisFloru3() {
        var rostlinyAStromy3 = new ArrayList<String>();

        rostlinyAStromy3.add("Orchidej");
        rostlinyAStromy3.add("Lilie");
        rostlinyAStromy3.add("Růže");
        rostlinyAStromy3.add("Pampeliška");
        rostlinyAStromy3.add("Podběl");
        rostlinyAStromy3.add("Sedmikráska");
        rostlinyAStromy3.add("Jabloň");
        rostlinyAStromy3.add("Slivoň");
        rostlinyAStromy3.add("Hrušeň");
        rostlinyAStromy3.add("Meruňka");
        rostlinyAStromy3.add("Ořech");

        Collections.reverse(rostlinyAStromy3);

        for (int i = 0; i < rostlinyAStromy3.size(); i++) {
            System.out.println(rostlinyAStromy3.get(i));
        }

        System.out.println(",,,,,,,");

    }

    /**
     * 3.1 úkol - uprav za pomoci googlu vypsani na "Počet znaků ve slově 'Ořech': '5' "
     */
    public static void vypisFloru3_1() {
        var rostlinyAStromy3_1 = new ArrayList<String>();

        rostlinyAStromy3_1.add("Orchidej");
        rostlinyAStromy3_1.add("Lilie");
        rostlinyAStromy3_1.add("Růže");
        rostlinyAStromy3_1.add("Pampeliška");
        rostlinyAStromy3_1.add("Podběl");
        rostlinyAStromy3_1.add("Sedmikráska");
        rostlinyAStromy3_1.add("Jabloň");
        rostlinyAStromy3_1.add("Slivoň");
        rostlinyAStromy3_1.add("Hrušeň");
        rostlinyAStromy3_1.add("Meruňka");
        rostlinyAStromy3_1.add("Ořech");

        Collections.reverse(rostlinyAStromy3_1);


        for (int i = 0; i < rostlinyAStromy3_1.size(); i++) {
            System.out.println("Počet znaků ve slově " + (rostlinyAStromy3_1.get(i)) + " : " + rostlinyAStromy3_1.get(i).length());
        }

        System.out.println(",,,,,,,");

        /* DRUHÁ A LEPŠÍ VARIANTA

        for (String clen : rostlinyAStromy3_1) {
            System.out.println("Počet znaků ve slově " + (clen) + " : " + (clen).length());
        }

        */

    }
    /**
     * 4. úkol - zkus vygooglit jake existuji vsechny standardne pouzivane formy cyklu, zajimaji me pouze klicova slova kterymi se vytvari (tzn bez implementace)
     */
     //   for , while , do-while


    /**
     * 5. úkol - vyber si vhodny cyklus, ktery jsi pouzila v predchozich bodech a ukonci ho po vypsani 5ti polozek
     */
    public static void vypisFloru5() {
        var rostlinyAStromy5 = new ArrayList<String>();

        rostlinyAStromy5.add("Orchidej");
        rostlinyAStromy5.add("Lilie");
        rostlinyAStromy5.add("Růže");
        rostlinyAStromy5.add("Pampeliška");
        rostlinyAStromy5.add("Podběl");
        rostlinyAStromy5.add("Sedmikráska");
        rostlinyAStromy5.add("Jabloň");
        rostlinyAStromy5.add("Slivoň");
        rostlinyAStromy5.add("Hrušeň");
        rostlinyAStromy5.add("Meruňka");
        rostlinyAStromy5.add("Ořech");

        // Collections.reverse(rostlinyAStromy5);


        for (int i = 0; i < 5; i++) {
            System.out.println(rostlinyAStromy5.get(i));
        }

        System.out.println(",,,,,,,");

        for (int i = 0; i < rostlinyAStromy5.size(); i++) {
            if (i > 4) {
                break;
            }
            System.out.println(rostlinyAStromy5.get(i));
        }

        System.out.println(",,,,,,,");

        int pocitadlo = 0;
        for (String clen : rostlinyAStromy5) {
            pocitadlo++;
            if (pocitadlo > 5) {
                break;
            }
            System.out.println(clen);
        }
        System.out.println(",,,,,,,");
    }

    /**
     * vytvoř si pole z následujících: ingredience = vajíčka, vepřové, knedlíky, brambory, kuřecí, hranolky, špenát, zelí, cibule, omáčka, vývar
     * <p>
     * 1. řazení a obracení pole metodami je pro trubky, cyklem projdi pole POZPÁTKU a vypiš polozky z "ingredience" pod sebe... (vedle i++ existuje i i--)
     * 2. oprav chybu/chyby
     * for(boolean i = 0; i < ingredience.length(); i + 1) {
     * System.out.println(ingredience.set(j));
     * }
     * 3. určitě máš ráda jídla, jako já, BEZ cyklu vypiš alespoň 3 jídla z "ingrediencí" pod sebe, příklad: "kuřecí vývar"
     * <p>
     * vytvoř druhé pole: cisla = 2, 3, 1, 6, 4, 5, 8, 7, 9, 11, 10
     * 4. cyklem vypiš pole "cisla" ZA sebou. Vypiš ale jen za podmínky, že současné číslo je větší, než předchozí
     * 5. jednim cyklem projdi obě pole najednou a vypisuj najednou na radek "polozka z cisla" a "polozka z ingredience"
     **/

    /**
     * 1. řazení a obracení pole metodami je pro trubky, cyklem projdi pole POZPÁTKU a vypiš polozky z "ingredience" pod sebe... (vedle i++ existuje i i--)
     */
    public static void vareni() {
        var ingredience = new ArrayList<String>();
        ingredience.add("vajíčka");
        ingredience.add("vepřové");
        ingredience.add("knedlíky");
        ingredience.add("brambory");
        ingredience.add("kuřecí");
        ingredience.add("hranolky");
        ingredience.add("špenát");
        ingredience.add("zelí");
        ingredience.add("cibule");
        ingredience.add("omáčka");
        ingredience.add("vývar");

        for (int j = ingredience.size() - 1; j >= 0; j--) {
            System.out.println(ingredience.get(j));
        }

        System.out.println(",,,,,,,");

    /**
     * 2. oprav chybu/chyby
     * for(boolean i = 0; i < ingredience.length(); i + 1) {
     * System.out.println(ingredience.set(j));
     * }
     */
        for (int i = 0; i < ingredience.size(); i++) {
            System.out.println(ingredience.get(i));
        }
        System.out.println(",,,,,,,");

     /**
      * 3. určitě máš ráda jídla, jako já, BEZ cyklu vypiš alespoň 3 jídla z "ingrediencí" pod sebe, příklad: "kuřecí vývar"
      */
        System.out.println(ingredience.get(1) + ", " + ingredience.get(2) + " a " + ingredience.get(6));
        System.out.println(ingredience.get(2) + " a " + ingredience.get(9));
        System.out.println(ingredience.get(4) + " a " + ingredience.get(5));

        System.out.println(",,,,,,,");
    }

     /**
      * vytvoř druhé pole: cisla = 2, 3, 1, 6, 4, 5, 8, 7, 9, 11, 10
      * 4. cyklem vypiš pole "cisla" ZA sebou. Vypiš ale jen za podmínky, že současné číslo je větší, než předchozí
      */
      public static void numero() {
        var cisla = new ArrayList<Integer>();
        cisla.add(2);
        cisla.add(3);
        cisla.add(1);
        cisla.add(6);
        cisla.add(4);
        cisla.add(5);
        cisla.add(8);
        cisla.add(7);
        cisla.add(9);
        cisla.add(11);
        cisla.add(10);

        /*
        for (int i = 0; i < cisla.size(); i++){

            if (i == 0) {
                System.out.println(cisla.get(i));
            }

            if (i > 0 && cisla.get(i) > cisla.get(i-1)) {
                System.out.println(cisla.get(i));
            }
        }
        */

        /*
        for (int i = 0; i < cisla.size(); i++){

            if (i == 0) {
                System.out.println(cisla.get(i));
            } else if (cisla.get(i) > cisla.get(i-1)) {
                System.out.println(cisla.get(i));
            }
        }
        */


        /*
        for (int i = 0; i < cisla.size(); i++){

            if ((i == 0) || (i > 0 && cisla.get(i) > cisla.get(i-1))) {
                System.out.println(cisla.get(i));
            }
        }
        */

        for (int i = 0; i < cisla.size(); i++){

            if (i == 0 || cisla.get(i) > cisla.get(i-1)) {
                System.out.println(cisla.get(i));
            }
        }

        System.out.println(",,,,,,,");

    }

    /**
     * 5. jednim cyklem projdi obě pole najednou a vypisuj najednou na radek "polozka z cisla" a "polozka z ingredience"
     **/
    public static void spojení(){
        var ingredience1 = new ArrayList<String>();
        ingredience1.add("vajíčka");
        ingredience1.add("vepřové");
        ingredience1.add("knedlíky");
        ingredience1.add("brambory");
        ingredience1.add("kuřecí");
        ingredience1.add("hranolky");
        ingredience1.add("špenát");
        ingredience1.add("zelí");
        ingredience1.add("cibule");
        ingredience1.add("omáčka");
        ingredience1.add("vývar");

        var cisla1 = new ArrayList<Integer>();
        cisla1.add(2);
        cisla1.add(3);
        cisla1.add(1);
        cisla1.add(6);
        cisla1.add(4);
        cisla1.add(5);
        cisla1.add(8);
        cisla1.add(7);
        cisla1.add(9);
        cisla1.add(11);
        cisla1.add(10);

        /*
        for (int i = 0; i < ingredience1.size(); i++) {
            System.out.println(cisla1.get(i) + " " + ingredience1.get(i));
        }
        */

        for (int i = 0; i < cisla1.size(); i++) {
            System.out.println(cisla1.get(i) + " " + ingredience1.get(i));
        }

        System.out.println(",,,,,,,,");

        /**
         * 5.1 serazeni ingredienci dle pole cisel, tak aby byla cisla serazena vzestupne
         **/

        Collections.sort(cisla1);

        for (int i = 0; i < cisla1.size(); i++) {
            System.out.println(cisla1.get(i) + ". " + ingredience1.get(cisla1.get(i)-1));
        }
    }

    /**
     * Tak, je na čase zabruslit do tajů tříd. Je potřeba si uvědomit, že třída je skoro to samé, jako Integer, nebo String...
     * Ve spoustě případů se s třídou zachází úplně stejně. Můžeš jí předávat v argumentu metody, returnovat, stejně jako číslo...
     * Jediný rozdíl je v tom, že číslo je prostě primitivní číslo, a třída je neprimitivní krabička ve které je více primitivních čísel a stringů...
     *
     * číslo vytvořís takto:
     * int cislo = 0;
     * třídu takto:
     * Trida trida = new Trida();
     *
     * Všimni si že třída má klíčové slovíčko new (to aby to ta java poznala), a na konci má závorky "()", to abys mohla třídu vytvořit už rovnou s nějakými hodnotami,
     * pokud chceš. Pokud nechceš, je potřeba tak jako tak dát nakonec "()" a tvůj oblíbený ";" :)
     *
     *   1. Vytvoř úplně prázdnou třídu bez čehokoliv, dej jí do package "tridy" (tzn. cz.devforce.zaklady.tridy)
     *   2. Vytvoř instanci třídy pomocí klíčového slova new... udělej podmínku, že pokud třída není null, vypiš "třída založena"
     *   3. Vytvoř třídu Osoba, která bude obsahovat property - stringy jmeno a prijmeni, vytvor konstruktor kery tyto stringy vyplni
     **/

    public static void instanceNemovitosti() {

        Nemovitost dum = new Nemovitost();

        if (dum != null) {
            System.out.println("třida založena");
        }
    }

    public static void instanceOsoby(){
        Osoba js = new Osoba("Jaroslav", "Svoboda");
        Osoba kf = new Osoba("Karolina", "Frolíková");
        Osoba ds = new Osoba("Daniel", "Svoboda");
        Osoba as = new Osoba("Anežka", "Svobodová");
    }



       /*
        Nemovitost dum = new Nemovitost();
        dum.dispozice = "3+kk";
        dum.barva = "bílá";
        dum.topeni = "elektrické-podlahové";
        dum.cena = "1.490.000 Kč";
        */

}

