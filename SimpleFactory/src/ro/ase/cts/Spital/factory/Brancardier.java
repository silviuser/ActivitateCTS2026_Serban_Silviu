package ro.ase.cts.Spital.factory;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void pontare() {
        System.out.println("Brancardier: "+super.nume+" inregistrat...");
    }
}
