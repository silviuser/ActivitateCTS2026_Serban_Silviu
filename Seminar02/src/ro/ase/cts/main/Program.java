package ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.loaders.AngajatiLoader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        try {
            listaAngajati = new AngajatiLoader().load("angajati.txt");
            for (Aplicant angajat : listaAngajati) {
                System.out.println(angajat.toString());
                angajat.afisareFinantare();
                angajat.afisareStatut();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
