package ro.ase.cts.Spital.clase;

public class Medic extends PersonalMedical{
    protected String specializare;

    public Medic(String nume, double salariu, String sectie, String specializare) {
        super(nume, salariu, sectie);
        this.specializare = specializare;
    }

    @Override
    public void pontare() {
        System.out.println("Medic "+this.specializare+": " +super.nume+" inregistrat...");
    }
}
