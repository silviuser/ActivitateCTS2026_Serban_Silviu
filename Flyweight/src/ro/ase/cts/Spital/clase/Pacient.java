package ro.ase.cts.Spital.clase;

public class Pacient implements IPacient{
    private final String cnp;
    private final String nume;
    private final String nrTelefon;
    private final String adresa;

    protected Pacient(String adresa, String nrTelefon, String nume, String cnp) {
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getNume() {
        return nume;
    }

    public String getCnp() {
        return cnp;
    }

    @Override
    public void afiseazaInternare(Internare internare) {
        System.out.println("Internare: " + this.nume + " (CNP " + this.cnp + ")");
        System.out.println("  Telefon: " + this.nrTelefon + " | Adresa: " + adresa);
        System.out.println("  Salon " + internare.getNrSalon()
                + ", pat " + internare.getNumarPat()
                + ", " + internare.getZileSpitalizare() + " zile");
    }
}
