package ro.ase.cts.Restaurant.factory;

public class SupaDeCiuperci extends Supa{
    private int cod;
    public SupaDeCiuperci(String detalii, int volum,int cod) {
        super(detalii, volum);
        this.cod = cod;
    }

    @Override
    public void preparare() {
        System.out.println("SE PREPARA SUPA DE CIUPERCI...");
    }
}
