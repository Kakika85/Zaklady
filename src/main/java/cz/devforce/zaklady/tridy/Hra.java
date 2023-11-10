package cz.devforce.zaklady.tridy;

import java.util.ArrayList;

public class Hra {

    private ArrayList<Object> objekty = new ArrayList<Object>();

    // otevřeno jsem to nechala pro případ odkazu z jiných tříd a v tomto případě by stálo za uváženou zda tuto metodu
    // neoddělit do utility třídy
    public void vyprazdnovaniObjektuAPoli() {
        if(!objekty.isEmpty()) {
            objekty.clear();
        }
    }

    public void startHry() {
        // Vyprázdníme pole, aby byla jistota, že po předchozí hře nezbyl žádný "bordel" :)
        vyprazdnovaniObjektuAPoli();

        // další startovací kód
        // bla
        // bla
        // bla
    }

    public void konecHry() {
        // Na konci hry vyprázdníme objekty (když hra spadne, nemusí dojít k vyprázdnění)
        vyprazdnovaniObjektuAPoli();

        // Další ukončovací kód
        // bla
        // bla
        // bla
    }
}

