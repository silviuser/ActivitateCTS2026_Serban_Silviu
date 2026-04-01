package ro.ase.cts.Spital.program;

import ro.ase.cts.Spital.clase.PersonalSpital;
import ro.ase.cts.Spital.enums.TipPersonalMedical;
import ro.ase.cts.Spital.enums.TipPersonalNonMedical;
import ro.ase.cts.Spital.factory.FabricaPersonal;
import ro.ase.cts.Spital.factory.FabricaPersonalMedical;
import ro.ase.cts.Spital.factory.FabricaPersonalNonMedical;

public class Main {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonalMedical = new FabricaPersonalMedical();
        FabricaPersonal fabricaPersonalNonMedical = new FabricaPersonalNonMedical();

        PersonalSpital medic = fabricaPersonalMedical
                .getPersonalSpital(TipPersonalMedical.MEDIC,"Marcel",200,"Neurologie","Neurolog");
        PersonalSpital brancardier = fabricaPersonalMedical
                .getPersonalSpital(TipPersonalMedical.BRANCARDIER,"Marcelica",240,"Generala");
        PersonalSpital secretar = fabricaPersonalNonMedical
                .getPersonalSpital(TipPersonalNonMedical.SECRETAR,"Maria",120,300);

        medic.pontare();
        brancardier.pontare();
        secretar.pontare();
    }
}
