package cz.devforce.zaklady;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProcvicovaniUkolu {
    public static void main(String[] args) {
        vypisFloru();
        vypisFloru2();
        vypisFloru3();
        vypisFloru3_1();
        vypisFloru5();

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
        int i;
        for (i = 0; i < 11; i++) {
            System.out.println(i + 1 + ". " + rostlinyAStromy[i]);
        }
    }

    // 2. úkol - najdi nejjednodussi zpusob jak seradit pole podle abecedy a vypis "3. strom z 10ti je Buk" (cislo 10 musi odpovidat poctu prvku v poli a nesmi byt napsane natvrdo)
    public static void vypisFloru2() {
        var rostlinyAStromy2 = Arrays.asList(rostlinyAStromy);

        Collections.sort(rostlinyAStromy2);

        for (int i = 0; i < 11; i++){
            System.out.println(i+1 + ". strom z " + rostlinyAStromy.length + "ti je " + rostlinyAStromy2.get(i));
        }
    }

    // 3. úkol - najdi zpusob jak seradit pole pozpatku a znovu vypis, tentokrat jen nazev "Buk" a nic vic
    public static void vypisFloru3() {
        var rostlinyAStromy3 = Arrays.asList(rostlinyAStromy);

        Collections.reverse(rostlinyAStromy3);

        for (int i = 0; i < rostlinyAStromy3.size(); i++) {
            System.out.println(rostlinyAStromy3.get(i));
        }
    }


    // 3.1 úkol - uprav za pomoci googlu vypsani na "Počet znaků ve slově 'Ořech': '5' "
    public static void vypisFloru3_1() {
        var rostlinyAStromy3 = Arrays.asList(rostlinyAStromy);

        for (int i = 0; i < rostlinyAStromy3.size(); i++){
            System.out.println("Počet znaků ve slově " + rostlinyAStromy3.get(i) + ": " + rostlinyAStromy3.get(i).length());
        }
    }

    // 5. úkol - vyber si vhodny cyklus, ktery jsi pouzila v predchozich bodech a ukonci ho po vypsani 5ti polozek

    public static void vypisFloru5() {
        var rostlinyAStromy5 = Arrays.asList(rostlinyAStromy);

        for (int i = 0; i < rostlinyAStromy5.size(); i++){
            if (i > 4) {
                break;
            }
            System.out.println(rostlinyAStromy5.get(i));
        }
    }
}