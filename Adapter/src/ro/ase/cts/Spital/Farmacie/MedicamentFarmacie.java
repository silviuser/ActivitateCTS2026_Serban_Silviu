package ro.ase.cts.Spital.Farmacie;

public class MedicamentFarmacie {
    private String nume;
    private double pret;

    public MedicamentFarmacie(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void cumparaMedicament(){
        System.out.println("Este cumparat medicamentul:"+this.nume +" de la farmacie");
    }
}
