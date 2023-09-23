package cz.devforce.zaklady;

import java.sql.SQLOutput;
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
    }


    /**
     * Vytvoř metodu, která bude for-cyklem procházet pole a vypisovat do konzole, co v tom poli je
     */
    private static final String[] rodina = new String[]{"Jára", "Kája", "Daník", "Anežka", "Domík"};

    public static void vypisClenyRodiny() {
        for (int i = 0; i < rodina.length; i++) {
            System.out.println(rodina[i]);
        }

        for (String clen : rodina) {
            System.out.printf(clen + ", ");
        }

        System.out.println("");

        for (String clen : rodina) {
            System.out.println(clen);
        }
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
        for (int i = 0; i < clenove.size(); i++) {
            System.out.println(clenove.get(i));
        }
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

    // 1. úkol - cyklem projdi pole a vypis pod sebe poradi a jmeno, napr "3. Buk"
    private static final String[] rostlinyAStromy = new String[]{"Orchidej", "Lilie", "Růže", "Pampeliška", "Podběl", "Sedmikráska", "Jabloň", "Slivoň", "Hrušeň", "Meruňka", "Ořech"};

    public static void vypisFloru() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i + 1 + ". " + rostlinyAStromy[i]);
        }

    }

    // 2. úkol - najdi nejjednodussi zpusob jak seradit pole podle abecedy a vypis "3. strom z 10ti je Buk" (cislo 10 musi odpovidat poctu prvku v poli a nesmi byt napsane natvrdo)
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
    }

    // 3. úkol - najdi zpusob jak seradit pole pozpatku a znovu vypis, tentokrat jen nazev "Buk" a nic vic
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
    }

    // 3.1 úkol - uprav za pomoci googlu vypsani na "Počet znaků ve slově 'Ořech': '5' "
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

        /* DRUHÁ A LEPŠÍ VARIANTA

        for (String clen : rostlinyAStromy3_1) {
            System.out.println("Počet znaků ve slově " + (clen) + " : " + (clen).length());
        }

        */

    }
    // 4. úkol - zkus vygooglit jake existuji vsechny standardne pouzivane formy cyklu, zajimaji me pouze klicova slova kterymi se vytvari (tzn bez implementace)
    //         - for , while , do-while


    // 5. úkol - vyber si vhodny cyklus, ktery jsi pouzila v predchozich bodech a ukonci ho po vypsani 5ti polozek

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

        Collections.reverse(rostlinyAStromy5);


        for (int i = 0; i < 5; i++) {
            System.out.println(rostlinyAStromy5.get(i));
        }
    }
}