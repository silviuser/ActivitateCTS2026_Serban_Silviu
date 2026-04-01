package ro.ase.cts.Restaurant.program;

import ro.ase.cts.Restaurant.factory.*;

public class Main {
    public static void main(String[] args) {
        Supa supaVita = SupaFactory.getInstance()
                .getSupa(200,"etalii supa vita", TipSupa.VITA);
        Supa supaDeCiuperci = SupaFactory.getInstance()
                .getSupa(200,"detalii supa ciuperci",TipSupa.CIUPERCI,12);

        supaVita.preparare();
        supaDeCiuperci.preparare();
    }
}
