package ro.ase.cts.Spital.clase;

public class Sectie implements Structura{
    private String numeSectie;
    private int nrAngajati;
    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+" sectia "+this.numeSectie+" cu nr angajati:"+this.nrAngajati);
    }

    public Sectie(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }
}
