package ro.ase.cts.Spital.program;

import ro.ase.cts.Spital.factory.PersonalSpital;
import ro.ase.cts.Spital.factory.PersonalSpitalFactory;
import ro.ase.cts.Spital.factory.TipPersonal;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = PersonalSpitalFactory.getInstance()
                .getPersonalSpital(TipPersonal.MEDIC,"Ionel",1000.00,"general");
        PersonalSpital brancardier = PersonalSpitalFactory.getInstance()
                .getPersonalSpital(TipPersonal.BRANCARDIER,"Marcel",400);
        medic.pontare();
        brancardier.pontare();
    }
}