package ro.ase.cts.Spital.clase;

public abstract class PersonalSpital {
    protected String nume;
    protected double salariu;
    public abstract void pontare();

    public PersonalSpital(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

}
