package ro.ase.cts.Spital.clase;

public class Registrator extends PersonalNonMedical{
    public Registrator(String nume, double salariu, int codAngajat) {
        super(nume, salariu, codAngajat);
    }

    @Override
    public void pontare() {
        System.out.println("Registrator: " +super.nume+" inregistrat...");

    }
}
