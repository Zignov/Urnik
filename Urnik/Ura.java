package Urnik;

public class Ura {
    
    int cas;
    Predmet predmet;


    public Ura(int cas, Predmet predmet) {
        this.cas = cas;
        this.predmet = predmet;
    }

    int vrniCas(){
        return cas;
    }

    Predmet vrniPredmet(){
        return predmet;
    }

}

