package ro.ase.cts.Spital.factory;

public class Medic extends PersonalSpital{
    private String specializare;

    public Medic(String nume, double salariu,String specializare) {
        super(nume, salariu);
        this.specializare = specializare;
    }


    @Override
    public void pontare() {
        System.out.println("Medic "+this.specializare+": " +super.nume+" inregistrat...");

    }
}
