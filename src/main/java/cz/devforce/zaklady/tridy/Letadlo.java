package cz.devforce.zaklady.tridy;

public class Letadlo {
    private String druh;
    private Integer pocetMist;
    private Integer prodanaMista;
    private boolean naplnenoTemer;


    public Letadlo(String newDruh, Integer newPocetMist, Integer newProdanaMista){
        druh = newDruh;
        pocetMist = newPocetMist;
        prodanaMista = newProdanaMista;
        naplnenoTemer = false;
            if (newProdanaMista > pocetMist*0.8){
                naplnenoTemer = true;
            }
    }

    public boolean getNaplnenoTemer() {
        return naplnenoTemer;
    }
}
