package ro.ase.cts.Spital.clase;

public class Secretar extends PersonalNonMedical{
    public Secretar(String nume, double salariu, int codAngajat) {
        super(nume, salariu, codAngajat);
    }

    @Override
    public void pontare() {
        System.out.println("Secretar: " +super.nume+" inregistrat...");

    }
}
