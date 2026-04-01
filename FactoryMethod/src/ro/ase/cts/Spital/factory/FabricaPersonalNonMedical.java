package ro.ase.cts.Spital.factory;

import ro.ase.cts.Spital.clase.*;
import ro.ase.cts.Spital.enums.TipPersonal;
import ro.ase.cts.Spital.enums.TipPersonalNonMedical;

public class FabricaPersonalNonMedical implements FabricaPersonal {
    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tip, String nume, double salariu, String sectie) {
        return getPersonalSpital(tip,nume,salariu,0);
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tip, String nume, double salariu, int codAngajat) {
        return switch (tip){
            case TipPersonalNonMedical.REGISTRATOR -> new Registrator(nume,salariu,codAngajat);
            case TipPersonalNonMedical.SECRETAR -> new Secretar(nume,salariu,codAngajat);
            default -> throw new RuntimeException("TipInvalid");
        };
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonal tip, String nume, double salariu, String sectie, String specializare) {
        return getPersonalSpital(tip,nume,salariu,0);
    }
}
