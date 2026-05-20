package ro.ase.cts.STB.program;

import ro.ase.cts.STB.clase.Calator;
import ro.ase.cts.STB.clase.CardBancar;
import ro.ase.cts.STB.clase.CardCalatorii;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Marcel");
        calator.plateste(10);

        calator.setModPlata(new CardCalatorii());
        calator.plateste(30);

        calator.setModPlata(new CardBancar());
        calator.plateste(21);
    }
}
