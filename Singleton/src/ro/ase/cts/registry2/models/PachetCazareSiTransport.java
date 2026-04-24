package ro.ase.cts.registry2.models;

public class PachetCazareSiTransport implements PachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Acest pachet include si cazare si transport...");
    }
}
