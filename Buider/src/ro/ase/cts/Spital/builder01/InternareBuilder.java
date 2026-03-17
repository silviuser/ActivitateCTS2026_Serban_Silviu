package ro.ase.cts.Spital.builder01;

public class InternareBuilder implements AbstractBuilder{
    private Internare internare;

    public InternareBuilder(String nume) {
        this.internare = new Internare(nume,false,false,false,false);
    }

    @Override
    public Internare buid() {
        return internare;
    }

    @Override
    public AbstractBuilder setNume(String nume) {
        this.internare.setNume(nume);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean hasPatRabatabil) {
        this.internare.setHasPatRabatabil(hasPatRabatabil);
        return this;
    }

    @Override
    public AbstractBuilder setHalat(boolean hasHalat) {
        this.internare.setHasHalat(hasHalat);
        return this;
    }

    @Override
    public AbstractBuilder setPapuci(boolean hasPapuci) {
        this.internare.setHasPapuciCamera(hasPapuci);
        return this;
    }

    @Override
    public AbstractBuilder setMicDeJun(boolean hasMicDeJun) {
        this.internare.setHasMicDeJun(hasMicDeJun);
        return this;
    }
}
