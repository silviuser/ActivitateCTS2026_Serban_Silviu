package ro.ase.cts.registry2.models;

import java.net.Socket;

public class PachetTransport implements PachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Acest pachet include doar transport...");
    }
}
