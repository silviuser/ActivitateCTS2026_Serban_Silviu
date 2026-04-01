package ro.ase.cts.Restaurant.factory;

public class SupaDeVita extends Supa{
    public SupaDeVita(String detalii, int volum) {
        super(detalii, volum);
    }

    @Override
    public void preparare() {
        System.out.println("SE PREPARA SUPA DE VITA...");
    }
}
