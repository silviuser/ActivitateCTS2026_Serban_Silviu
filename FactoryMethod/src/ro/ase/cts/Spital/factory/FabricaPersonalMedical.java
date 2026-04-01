package ro.ase.cts.Spital.factory;

import ro.ase.cts.Spital.clase.Asistent;
import ro.ase.cts.Spital.clase.Brancardier;
import ro.ase.cts.Spital.clase.Medic;
import ro.ase.cts.Spital.clase.PersonalSpital;
import ro.ase.cts.Spital.enums.TipPersonal;
import ro.ase.cts.Spital.enums.TipPersonalMedical;

public class FabricaPersonalMedical implements FabricaPersonal {
    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tip, String nume, double salariu, String sectie) {
        return switch (tip){
            case TipPersonalMedical.ASISTENT -> new Asistent(nume,salariu,sectie);
            case TipPersonalMedical.BRANCARDIER -> new Brancardier(nume,salariu,sectie);
            case TipPersonalMedical.MEDIC -> new Medic(nume,salariu,sectie,"general");
            default -> throw new RuntimeException("TipInvalid");
        };
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tip, String nume, double salariu, int codAngajat) {
        return getPersonalSpital(tip,nume,salariu,"sectie default");
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tip, String nume, double salariu, String sectie, String specializare) {
        return switch (tip){
            case TipPersonalMedical.ASISTENT -> new Asistent(nume,salariu,sectie);
            case TipPersonalMedical.BRANCARDIER -> new Brancardier(nume,salariu,sectie);
            case TipPersonalMedical.MEDIC -> new Medic(nume,salariu,sectie,specializare);
            default -> throw new RuntimeException("TipInvalid");
        };
    }
}
