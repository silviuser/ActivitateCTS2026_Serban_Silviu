package ro.ase.cts.Restaurant.factory;

public class SupaDeLegume extends Supa{
    public SupaDeLegume(String detalii, int volum) {
        super(detalii, volum);
    }

    @Override
    public void preparare() {
        System.out.println("SE PREPARA SUPA DE LEGUME...");
    }
}
