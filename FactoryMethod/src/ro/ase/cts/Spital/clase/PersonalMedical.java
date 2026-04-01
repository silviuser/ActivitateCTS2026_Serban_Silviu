package ro.ase.cts.Spital.clase;

public abstract class PersonalMedical extends PersonalSpital{
    private String sectie;

    public PersonalMedical(String nume, double salariu, String sectie) {
        super(nume, salariu);
        this.sectie = sectie;
    }
}
