package ro.ase.cts.Spital.clase;

public abstract class PersonalNonMedical extends PersonalSpital{
    protected int codAngajat;

    public PersonalNonMedical(String nume, double salariu, int codAngajat) {
        super(nume, salariu);
        this.codAngajat = codAngajat;
    }
}
