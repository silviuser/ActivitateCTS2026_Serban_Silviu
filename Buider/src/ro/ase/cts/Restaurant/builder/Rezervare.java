package ro.ase.cts.Restaurant.builder;

public class Rezervare {
    private boolean hasAsezareLaGeam;
    private boolean hasScauneErgonomice;
    private String decorareMese;
    private String genMuzica;

    private Rezervare(RezervareBuilder builder) {
        this.hasAsezareLaGeam = builder.hasAsezareLaGeam;
        this.hasScauneErgonomice = builder.hasScauneErgonomice;
        this.decorareMese = builder.decorareMese;
        this.genMuzica = builder.genMuzica;
    }

    public boolean isHasAsezareLaGeam() {
        return hasAsezareLaGeam;
    }

    public boolean isHasScauneErgonomice() {
        return hasScauneErgonomice;
    }

    public String getDecorareMese() {
        return decorareMese;
    }

    public String getGenMuzica() {
        return genMuzica;
    }
    public static RezervareBuilder builder(){
        return new RezervareBuilder();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("hasAsezareLaGeam=").append(hasAsezareLaGeam);
        sb.append(", hasScauneErgonomice=").append(hasScauneErgonomice);
        sb.append(", decorareMese='").append(decorareMese).append('\'');
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class RezervareBuilder implements AbstractBuider{
        private boolean hasAsezareLaGeam = false;
        private boolean hasScauneErgonomice = false;
        private String decorareMese = "Normal";
        private String genMuzica = "fara muzica";

        public RezervareBuilder setHasAsezareLaGeam(boolean hasAsezareLaGeam) {
            this.hasAsezareLaGeam = hasAsezareLaGeam;
            return this;
        }

        public RezervareBuilder setHasScauneErgonomice(boolean hasScauneErgonomice) {
            this.hasScauneErgonomice = hasScauneErgonomice;
            return this;
        }

        public RezervareBuilder setDecorareMese(String decorareMese) {
            this.decorareMese = decorareMese;
            return this;
        }

        public RezervareBuilder setGenMuzica(String genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }

        @Override
        public Rezervare build() {
            return new Rezervare(this);
        }
    }
}
