package ro.ase.cts.STB.clase;

public class Calator implements ICalator{
    private String nume;
    @Override
    public void receptioneazaMesaj(String mesajReceptionat) {
        System.out.println("Autobuzul pleaca din statie : "+mesajReceptionat);
    }

    public Calator(String nume) {
        this.nume = nume;
    }
}
