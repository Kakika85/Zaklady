package cz.devforce.zaklady;

public class Ukoly {
    public static void main(String[] args) {
        generatorCisel(9, 5);
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
}

