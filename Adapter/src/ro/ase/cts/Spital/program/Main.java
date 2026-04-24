package ro.ase.cts.Spital.program;

import ro.ase.cts.Spital.Farmacie.MedicamentFarmacie;
import ro.ase.cts.Spital.Spital.Medicament;
import ro.ase.cts.Spital.Spital.MedicamentAdapter;

public class Main {
    private static void procuraMedicament(MedicamentFarmacie medicament){
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {
        Medicament medicamentSpital = new Medicament("Nurofen-reteta",20);
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Algocalmin",10);

        medicamentSpital.achizitioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();


        procuraMedicament(medicamentFarmacie);
//        procuraMedicament(medicamentSpital);
        MedicamentAdapter adaptor = new MedicamentAdapter(medicamentSpital);
        procuraMedicament(adaptor);

    }
}
