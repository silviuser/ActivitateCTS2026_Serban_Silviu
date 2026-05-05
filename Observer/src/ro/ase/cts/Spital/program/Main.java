package ro.ase.cts.Spital.program;

import ro.ase.cts.Spital.clase.ISpital;
import ro.ase.cts.Spital.clase.Pacient;
import ro.ase.cts.Spital.clase.PacientAbonat;
import ro.ase.cts.Spital.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientAbonat("Ionut",23);
        Pacient pacient2 = new PacientAbonat("Marcu",21);
        Pacient pacient3 = new PacientAbonat("Matei",22);
        ISpital spital = new Spital("CFR");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);
        ((Spital)spital).notificaVirus();
        System.out.println("----------------------------");
        ((Spital)spital).notificaPandemie();

    }
}