package ro.ase.cts.Restaurant.factory;

public class SupaFactory {
    private static SupaFactory instance = null;

    private SupaFactory() { }

    public static synchronized SupaFactory getInstance(){
        if(instance == null){
            instance = new SupaFactory();
        }
        return instance;
    }

    public Supa getSupa(int volum, String detalii, TipSupa tip){
        if(tip == TipSupa.VITA){
            return new SupaDeVita(detalii,volum);
        }
        if(tip == TipSupa.LEGUME){
            return new SupaDeLegume(detalii,volum);
        }
        return null;
    }
    public Supa getSupa(int volum, String detalii, TipSupa tip, int cod){
        if(tip == TipSupa.CIUPERCI){
            return new SupaDeCiuperci(detalii,volum,cod);
        }
        return null;
    }
}
