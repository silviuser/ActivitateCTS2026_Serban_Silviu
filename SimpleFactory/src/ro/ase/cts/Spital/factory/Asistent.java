package ro.ase.cts.Spital.factory;

public class Asistent extends PersonalSpital{
    public Asistent(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void pontare() {
        System.out.println("Asistent: "+super.nume+" inregistrat...");
    }
}
