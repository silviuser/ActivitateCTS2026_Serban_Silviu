package ro.ase.cts.factory;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.SupaCiuperci;
import ro.ase.cts.clase.SupaLegume;
import ro.ase.cts.clase.SupaVita;

public class SupeFactory implements FeluriDeMancareFactory{

    @Override
    public FelDeMancare creareFelDeMancare(TipFeluriDeMancare tip) {
        return switch (tip){
            case TipSupe.SupaCiuperci -> new SupaCiuperci();
            case TipSupe.SupaLegume -> new SupaLegume();
            case TipSupe.SupaVita -> new SupaVita();
            default -> null;
        };
    }
}
