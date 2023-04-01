package Urnik;

public class Predmet {
    
    public String okrajsava;
    private String ime;
    private String opis;

    public Predmet(String okrajsava, String ime, String opis){
        this.okrajsava = okrajsava;
        this.ime = ime;
        this.opis = opis;
    }


    Predmet predmet = new Predmet(okrajsava, ime, opis);

    public String vrniIme (String ime){
        return(predmet.ime);
    }

    public String vrniOkrajsavo (String okrajsava){
        return(predmet.okrajsava);
    }

    public String vrniOpis (String opis){
        return(predmet.opis);
    }

}
