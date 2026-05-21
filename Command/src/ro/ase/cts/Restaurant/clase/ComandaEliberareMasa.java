package ro.ase.cts.Restaurant.clase;

public class ComandaEliberareMasa implements Command{
    private Masa masa;

    public ComandaEliberareMasa(Masa masa) {
        this.masa = masa;
    }
    @Override
    public void execute() {
        this.masa.elibereaza();
    }
}
