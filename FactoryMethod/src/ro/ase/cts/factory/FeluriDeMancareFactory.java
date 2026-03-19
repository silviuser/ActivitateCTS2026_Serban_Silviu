package ro.ase.cts.factory;

import ro.ase.cts.clase.FelDeMancare;

public interface FeluriDeMancareFactory {
    FelDeMancare creareFelDeMancare(TipFeluriDeMancare tip);
}
