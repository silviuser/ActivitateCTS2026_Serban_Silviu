package ro.ase.cts.Spital.factory;

public class PersonalSpitalFactory {
    private static PersonalSpitalFactory instance = null;

    private PersonalSpitalFactory() {
    }
    public static PersonalSpitalFactory getInstance(){
        if(instance == null){
            instance = new PersonalSpitalFactory();
        }
        return instance;
    }
    public PersonalSpital getPersonalSpital(TipPersonal tip, String nume, double salariu){
        if(tip == TipPersonal.ASISTENT){
            return new Asistent(nume,salariu);
        }
        if(tip == TipPersonal.BRANCARDIER){
            return new Brancardier(nume,salariu);
        }
        return null;
    }
    public PersonalSpital getPersonalSpital(TipPersonal tip, String nume, double salariu,String specializare){
        if(tip == TipPersonal.MEDIC){
            return new Medic(nume,salariu,specializare);
        }
        return null;
    }
}
