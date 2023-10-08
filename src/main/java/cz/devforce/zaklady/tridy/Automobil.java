package cz.devforce.zaklady.tridy;

public class Automobil {
    private String znacka;
    private AutoTyp autoTyp;
    private Integer pohonKol;
    private Boolean vyhrivanaSedadla;


    public Automobil(String newZnacka, AutoTyp newAutoTyp, Integer newPohonKol, Boolean newVyhrivanaSedadla){
        znacka = newZnacka;
        autoTyp = newAutoTyp;
        pohonKol = newPohonKol;
        vyhrivanaSedadla = newVyhrivanaSedadla;
    }
    public Automobil (String newZnacka, AutoTyp newAutoTyp){
        znacka = newZnacka;
        autoTyp = newAutoTyp;
    }
}
