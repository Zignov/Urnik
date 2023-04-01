package Urnik;
import java.util.Arrays;

public class Urnik {



    private int steviloPredmetov;
    Predmet[] predmeti = new Predmet[steviloPredmetov];

    String [] zbirkaPredmetov  = new String[steviloPredmetov];
    String [][] zbirkaUr = new String[4][9];


    public void dodajPredmet(Predmet predmet) {
        for (int i = steviloPredmetov; i<=0; i--){
            if (zbirkaPredmetov[i] != null){
                zbirkaPredmetov[i+1] = predmet.toString();
            }
        }
    }

    public void odstraniPredmet(Predmet predmet){
        for (int i = 0; i< zbirkaPredmetov.length; i++){
            if (zbirkaPredmetov[i] == predmet.toString()){
                zbirkaPredmetov[i] = null;
            }
        }
    }


    String PridobiPredmet(String okrajsava){
        return okrajsava;
    }


    public void dodajUro(int dan, Ura ura, Predmet predmet){
        zbirkaUr[dan][ura.cas] = predmet.okrajsava;
    }

    public void odstraniUro(int dan, Ura ura){
        zbirkaUr[dan][ura.cas] = null;
    }


    String zbirkaUr(int dan){
        return Arrays.toString(zbirkaUr[dan]);
    }

    String izpisiVse(){
        return Arrays.toString(zbirkaUr);
    }


    
}
