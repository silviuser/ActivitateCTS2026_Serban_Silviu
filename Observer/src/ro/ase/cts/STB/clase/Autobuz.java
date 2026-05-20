package ro.ase.cts.STB.clase;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements IAutobuz{
    private List<ICalator> lista = new ArrayList<>();
    @Override
    public void notifica() {
        lista.forEach(c->c.receptioneazaMesaj("PORNIRE"));
    }

    @Override
    public void abonareCalator(ICalator calator) {
        lista.add(calator);
    }

    @Override
    public void dezabonareCalator(ICalator calator) {
        lista.remove(calator);
    }

    public Autobuz() {
    }
}
