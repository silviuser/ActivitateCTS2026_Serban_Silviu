package ro.ase.cts.Spital.builder01;

public interface AbstractBuilder {
    Internare buid();
    AbstractBuilder setNume(String nume);
    AbstractBuilder setPatRabatabil(boolean hasPatRabatabil);
    AbstractBuilder setHalat(boolean hasHalat);
    AbstractBuilder setPapuci(boolean hasPapuci);
    AbstractBuilder setMicDeJun(boolean hasMicDeJun);
}
