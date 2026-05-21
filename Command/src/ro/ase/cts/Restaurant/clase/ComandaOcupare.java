package ro.ase.cts.Restaurant.clase;

public class ComandaOcupare implements Command{
    private Masa masa;

    public ComandaOcupare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void execute() {
        this.masa.ocupa();
    }
}
