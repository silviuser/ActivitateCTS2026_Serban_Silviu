package ro.ase.cts.STB.program;

import ro.ase.cts.STB.clase.Autobuz;
import ro.ase.cts.STB.clase.AutobuzCursaSpeciala;
import ro.ase.cts.STB.clase.AutobuzDeNoapte;
import ro.ase.cts.STB.clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz = new Autobuz("41",20);
        autobuz.opresteInStatie();
        autobuz.opresteInStatie();

        MijlocDeTransport autobuzDeNoapte = new AutobuzDeNoapte(autobuz);

        autobuzDeNoapte.opresteInStatie();

        MijlocDeTransport autobuzGol = new AutobuzDeNoapte(
                new Autobuz("30",0));
        autobuzGol.opresteInStatie();

        MijlocDeTransport cursaSpeciala = new AutobuzCursaSpeciala(
                new Autobuz("Cursa speciala",10)
        );
        cursaSpeciala.opresteInStatie();
    }
}