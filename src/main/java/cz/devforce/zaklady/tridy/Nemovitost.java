package cz.devforce.zaklady.tridy;

public class Nemovitost {
    private Druh druh;
    private Dispozice dispozice;
    private String barva;
    private String topeni;
    public Integer cena;

    public Nemovitost(Druh druh_, Dispozice dispozice_, String barva_, String topeni_, Integer cena_) {
        druh = druh_;
        dispozice = dispozice_;
        barva = barva_;
        topeni = topeni_;
        cena = cena_;
    }
    public Nemovitost(Druh druh_, Dispozice dispozice_, String topeni_, Integer cena_){
        druh = druh_;
        dispozice = dispozice_;
        topeni = topeni_;
        cena = cena_;
    }
    public Nemovitost(Druh druh_){
        druh = druh_;
    }
}

