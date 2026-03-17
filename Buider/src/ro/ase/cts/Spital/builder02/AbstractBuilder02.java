package ro.ase.cts.Spital.builder02;

import ro.ase.cts.Spital.builder02.Internare;

public interface AbstractBuilder02 {
    Internare buid(String nume);
    AbstractBuilder02 setPatRabatabil(boolean hasPatRabatabil);
    AbstractBuilder02 setHalat(boolean hasHalat);
    AbstractBuilder02 setPapuci(boolean hasPapuci);
    AbstractBuilder02 setMicDeJun(boolean hasMicDeJun);
}
