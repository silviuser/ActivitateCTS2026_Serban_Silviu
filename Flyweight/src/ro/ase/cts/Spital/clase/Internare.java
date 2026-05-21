package ro.ase.cts.Spital.clase;

public class Internare {
    private int nrSalon;
    private int numarPat;
    private int zileSpitalizare;

    public Internare(int nrSalon, int numarPat, int zileSpitalizare) {
        this.nrSalon = nrSalon;
        this.numarPat = numarPat;
        this.zileSpitalizare = zileSpitalizare;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public int getNumarPat() {
        return numarPat;
    }

    public int getZileSpitalizare() {
        return zileSpitalizare;
    }
}
