package ro.ase.cts.Restaurant.factory;

public abstract class Supa {
    protected int volum;
    protected String detalii;

    public Supa(String detalii, int volum) {
        this.detalii = detalii;
        this.volum = volum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(volum);
        sb.append(" ml, ").append(detalii);
        return sb.toString();
    }

    public abstract void preparare();
}
