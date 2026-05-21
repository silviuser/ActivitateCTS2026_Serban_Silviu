package ro.ase.cts.Spital.program;

import ro.ase.cts.Spital.clase.Departament;
import ro.ase.cts.Spital.clase.Sectie;
import ro.ase.cts.Spital.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura spital = new Departament("spital");
        Structura administrativ = new Departament("Administrativ");
        Structura secretariat = new Sectie("Secretariat",4);
        Structura management= new Sectie("management",3);
        ((Departament)spital).adaugaStructura(administrativ);
        ((Departament)spital).adaugaStructura(management);
        ((Departament)administrativ).adaugaStructura(secretariat);

        spital.afiseazaDetaliiStructura("  ");

    }
}