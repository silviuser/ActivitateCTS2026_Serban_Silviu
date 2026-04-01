package ro.ase.cts.Spital.factory;

import ro.ase.cts.Spital.clase.PersonalSpital;
import ro.ase.cts.Spital.enums.TipPersonal;

public interface FabricaPersonal {
    PersonalSpital getPersonalSpital(TipPersonal tip,String nume,double salariu,String sectie);
    PersonalSpital getPersonalSpital(TipPersonal tip,String nume,double salariu,int codAngajat);
    PersonalSpital getPersonalSpital(TipPersonal tip,String nume,double salariu,String sectie,String specializare);
}
