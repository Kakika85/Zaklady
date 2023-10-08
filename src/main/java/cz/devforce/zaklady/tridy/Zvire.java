package cz.devforce.zaklady.tridy;

public class Zvire {
    private String nazev;
    private Integer pocetNohou;
    private Urceni urceni;

    public Jmena jmena;

    public Zvire(String newNazev, Integer newPocetNohou, Urceni newUrceni){
        nazev = newNazev;
        pocetNohou = newPocetNohou;
        urceni = newUrceni;
    }
    public Zvire(String newNazev, Urceni newUrceni){
        nazev = newNazev;
        urceni = newUrceni;
    }

    public Zvire(String newNazev, Integer newPocetNohou, Urceni newUrceni, Jmena newJmena){
        nazev = newNazev;
        pocetNohou = newPocetNohou;
        urceni = newUrceni;
        jmena = newJmena;
    }
}
