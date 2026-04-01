package ro.ase.cts.Spital.clase;

public class Asistent extends PersonalMedical{
    public Asistent(String nume, double salariu, String sectie) {
        super(nume, salariu, sectie);
    }
    @Override
    public void pontare() {
        System.out.println("Asistent: " +super.nume+" inregistrat...");
    }
}
