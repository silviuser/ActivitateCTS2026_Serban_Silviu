package ro.ase.cts.Restaurant.program;

import ro.ase.cts.Restaurant.clase.NotaDePlata;
import ro.ase.cts.Restaurant.clase.NotaDePlataAbstract;
import ro.ase.cts.Restaurant.decorator.NotaDePlata1Mai;
import ro.ase.cts.Restaurant.decorator.NotaDePlataDecorator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(String.valueOf(LocalDate.now()),200);
        notaDePlata.printeaza();
        NotaDePlataDecorator notaDe1MAI = new NotaDePlata1Mai(notaDePlata);
        notaDe1MAI.printeazaFelicitare();

    }
}