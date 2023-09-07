package cz.devforce.zaklady;

import java.util.ArrayList;

public class Ukoly {
    public static void main(String[] args) {
        generatorCisel(9, 5);
        vypisClenyRodiny();
        vypisClenyRodiny2();
    }


    /**
    vytvoř metodu, volanou z  mainu, název si vymysli,aby odpovídal co metoda dělá
    metoda bude generovat posloupnost čísel
    - bude možné zadat počáteční číslo
    - bude možné zadat počet opakování - začni na 9 a pokračuj dalších 5 čísel... čili skočíš na 14
    */

    public static void generatorCisel(int pocatecniHodnota, int pocetOpakovani) {
        for (int i = pocatecniHodnota; i <= pocatecniHodnota+pocetOpakovani; i++) {
            System.out.println(i);
        }
    }


    /**
     * Vytvoř metodu, která bude for-cyklem procházet pole a vypisovat do konzole, co v tom poli je
     */
    private static final String[] rodina = new String[] { "Jára", "Kája", "Daník", "Anežka", "Domík" };
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

}

