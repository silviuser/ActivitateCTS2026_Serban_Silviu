package ro.ase.cts.Restaurant.program;

import ro.ase.cts.Restaurant.clase.ComandaOcupare;
import ro.ase.cts.Restaurant.clase.ComandaRezervare;
import ro.ase.cts.Restaurant.clase.Masa;
import ro.ase.cts.Restaurant.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        operator.adaugaComanda(new ComandaOcupare(new Masa(12)));
        operator.adaugaComanda(new ComandaRezervare(new Masa(11)));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
