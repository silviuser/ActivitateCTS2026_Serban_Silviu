package ro.ase.cts.recapitulare.models;

public class Magazin {
    private String denumire;
    private int suprafata;

    private int nrIntrari;
    private String tipPodea;

    public String getDenumire() {
        return denumire;
    }

    public int getSuprafata() {
        return suprafata;
    }

    public int getNrIntrari() {
        return nrIntrari;
    }

    public String getTipPodea() {
        return tipPodea;
    }

    private Magazin(MagazinBuilder builder) {
        this.denumire = builder.denumire;
        this.suprafata = builder.suprafata;
        this.nrIntrari = builder.nrIntrari;
        this.tipPodea = builder.tipPodea;
    }
    public static MagazinBuilder builder(String denumire, int suprafata){
        return new MagazinBuilder(denumire,suprafata);
    }
    public static class MagazinBuilder implements AbstractBuilder{
        private String denumire;
        private int suprafata;

        private int nrIntrari;
        private String tipPodea;

        private MagazinBuilder(String denumire, int suprafata) {
            this.denumire = denumire;
            this.suprafata = suprafata;
            this.nrIntrari = suprafata/100;
            this.tipPodea = "regular";
        }

        public MagazinBuilder setTipPodea(String tipPodea) {
            this.tipPodea = tipPodea;
            return this;
        }

        public MagazinBuilder setNrIntrari(int nrIntrari) {
            if(this.suprafata/100 < nrIntrari){
                this.nrIntrari = nrIntrari;
            }
            return this;
        }

        @Override
        public Magazin build() {
            return new Magazin(this);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazin{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", suprafata=").append(suprafata);
        sb.append(", nrIntrari=").append(nrIntrari);
        sb.append(", tipPodea='").append(tipPodea).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
