package ro.ase.cts.STB.clase;

public class Calator {
    private String nume;
    private ModPlata modPlata;
    public void plateste(double suma){
        this.modPlata.plateste(suma);
    }

    public Calator(ModPlata modPlata, String nume) {
        this.modPlata = modPlata;
        this.nume = nume;
    }

    public Calator(String nume) {
        this.nume = nume;
        this.modPlata = new SMS();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
}
