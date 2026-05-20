package ro.ase.cts.STB.program;

import ro.ase.cts.STB.clase.Autobuz;
import ro.ase.cts.STB.clase.Calator;
import ro.ase.cts.STB.clase.IAutobuz;

public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz = new Autobuz();
        autobuz.abonareCalator(new Calator("Ionel"));
        autobuz.abonareCalator(new Calator("Marcel"));
        autobuz.abonareCalator(new Calator("Mihai"));

        autobuz.notifica();

    }
}
