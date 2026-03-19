package ro.ase.cts.factory;

import ro.ase.cts.clase.*;
public class DeserturiFactory implements FeluriDeMancareFactory{

    @Override
    public FelDeMancare creareFelDeMancare(TipFeluriDeMancare tip) {
        return switch (tip){
            case TipDeserturi.Clatite ->new Clatite();
            case TipDeserturi.Papanasi -> new Papanasi();
            case TipDeserturi.CheeseCake-> new CheeseCake();
            default -> null;
        };
    }
}
