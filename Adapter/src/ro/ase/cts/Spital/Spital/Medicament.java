package ro.ase.cts.Spital.Spital;

public class Medicament {
    private String nume;
    private double pret;

    public Medicament(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public void achizitioneazaMedicament(){
        if(prezintaReteta()){
            System.out.println("Este achizitionat medicamentul: "+ this.nume);
        }else {
            System.out.println("Pentru medicamentu: "+this.nume+" este nevoie de reteta!");
        }
    }
    public boolean prezintaReteta(){
        return this.nume.contains("reteta");
    }

}
