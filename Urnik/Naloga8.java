package Urnik;

public class Naloga8 {
    public static void main (String[]args){

        Predmet slovenscina = new Predmet("slo","slovenscina","fuj");
        Predmet anglescina = new Predmet("ang","anglescina","angleski jezik");
        Predmet nemscina = new Predmet ("nem", "nemscina", "Ich spreche deutch seher gut");
        Predmet matematika = new Predmet ("mat", "matematika","a+b=c");
        Predmet prosto = new Predmet ("/", "prosto", "frej smo");       

        Ura prva = new Ura(0, slovenscina);
        Ura druga = new Ura(1, anglescina);
        Ura tretja = new Ura(2, anglescina);
        Ura cetrta = new Ura(3, prosto);
        Ura peta = new Ura(4, matematika);


        System.out.println(Urnik.izpisiVse());
        System.out.println(Predmet.vrniOpis(nemscina));


    }


}
