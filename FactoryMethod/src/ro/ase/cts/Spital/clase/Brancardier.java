package ro.ase.cts.Spital.clase;

public class Brancardier extends PersonalMedical{
    public Brancardier(String nume, double salariu, String sectie) {
        super(nume, salariu, sectie);
    }
    @Override
    public void pontare() {
        System.out.println("Brancardier: "+super.nume+" inregistrat...");
    }
}
