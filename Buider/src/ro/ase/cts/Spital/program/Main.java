package ro.ase.cts.Spital.program;

import ro.ase.cts.Spital.builder01.AbstractBuilder;
import ro.ase.cts.Spital.builder01.Internare;
import ro.ase.cts.Spital.builder01.InternareBuilder;
import ro.ase.cts.Spital.builder02.AbstractBuilder02;
import ro.ase.cts.Spital.builder02.InternareBuilder02;

public class Main {
    public static void main(String[] args) {
        Internare internare = new Internare();
        internare.setNume("Marcel");
        internare.setHasPatRabatabil(true);
        Internare internare2 = new Internare("Ionel",false,false,true,false);

        AbstractBuilder builder = new InternareBuilder("Georgica");
        Internare internare3 = builder.setPatRabatabil(true).buid();
        Internare internare4 = builder.setPapuci(true).setNume("Gigel").buid();

        System.out.println(internare3);
        System.out.println(internare4);

        AbstractBuilder02 builder2 = new InternareBuilder02()
                .setMicDeJun(true);
        ro.ase.cts.Spital.builder02.Internare internare5 = builder2.buid("Gigel");
        ro.ase.cts.Spital.builder02.Internare internare6 = builder2.buid("Maria");

        internare5.setHasHalat(true);
        //to do
        //inner class varianta 3 -> implementat in clasa internare clasa buider ce implementeaza interfata
    }
}