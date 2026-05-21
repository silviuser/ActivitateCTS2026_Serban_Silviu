package ro.ase.cts.Restaurant.clase;

public class ComandaRezervare implements Command{
    private Masa masa;

    public ComandaRezervare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void execute() {
        this.masa.rezerva();
    }
}
