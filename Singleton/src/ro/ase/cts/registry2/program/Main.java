package ro.ase.cts.registry2.program;

import ro.ase.cts.registry2.models.PachetCazare;
import ro.ase.cts.registry2.models.PachetTransport;
import ro.ase.cts.registry2.models.PachetTuristic;
import ro.ase.cts.registry2.models.RegistryPachete;

public class Main {
    public static void main(String[] args) {
        PachetTuristic cazare = new PachetCazare();
        PachetTuristic cazare2 = new PachetCazare();
        PachetTuristic transport = new PachetTransport();

        RegistryPachete.register("Cazare",cazare);
        RegistryPachete.register("Transport",transport);

        RegistryPachete.getPachet("Cazare").descriere();
        RegistryPachete.getPachet("Transport").descriere();
    }
}
