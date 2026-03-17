package ro.ase.cts.Spital.builder02;

public class InternareBuilder02 implements AbstractBuilder02{
    private boolean hasPatRabatabil;
    private boolean hasMicDeJun;
    private boolean hasPapuciCamera;
    private boolean hasHalat;

    public InternareBuilder02() {
        this.hasPatRabatabil = false;
        this.hasMicDeJun = false;
        this.hasPapuciCamera = false;
        this.hasHalat = false;
    }

    @Override
    public Internare buid(String nume) {
        return new Internare(nume,hasPatRabatabil,hasMicDeJun,hasPapuciCamera,hasHalat);
    }

    @Override
    public AbstractBuilder02 setPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder02 setHalat(boolean hasHalat) {
        this.hasHalat = hasHalat;
        return this;
    }

    @Override
    public AbstractBuilder02 setPapuci(boolean hasPapuci) {
        this.hasPapuciCamera = hasPapuci;
        return this;
    }

    @Override
    public AbstractBuilder02 setMicDeJun(boolean hasMicDeJun) {
        this.hasMicDeJun = hasMicDeJun;
        return this;
    }
}
