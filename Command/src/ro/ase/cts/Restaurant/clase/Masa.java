package ro.ase.cts.Restaurant.clase;

public class Masa {
    private StareMasa stare;
    private int numarMasa;

    public Masa(int numarMasa) {
        this.stare = StareMasa.LIBERA;
        this.numarMasa = numarMasa;
    }
    public void rezerva(){
        if(this.stare == StareMasa.LIBERA){
            this.stare = StareMasa.REZERVATA;
            System.out.println("S-A REZERVAT MASA "+this.numarMasa );
        }else System.out.println("Nu este disponibila masa: "+this.numarMasa);
    }
    public void ocupa(){
        if(this.stare != StareMasa.OCUPATA){
            this.stare = StareMasa.OCUPATA;
            System.out.println("S-A OCUPAT MASA "+this.numarMasa );
        }else System.out.println("Nu este disponibila masa: "+this.numarMasa);
    }
    public void elibereaza(){
        this.stare = StareMasa.LIBERA;
        System.out.println("S A ELIBERAT MASA "+this.numarMasa);
    }
}
