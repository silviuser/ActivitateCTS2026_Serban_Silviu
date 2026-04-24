package ro.ase.cts.recapitulare.program;

import ro.ase.cts.recapitulare.models.Magazin;

public class Main {
    public static void main(String[] args) {
        Magazin magazin = Magazin.builder("H&M",350)
                .setNrIntrari(4)
                .setTipPodea("colorata")
                .build();
        System.out.println(magazin);
    }
}
