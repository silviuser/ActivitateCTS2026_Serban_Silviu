package ro.ase.cts.Spital.Spital;

import ro.ase.cts.Spital.Farmacie.MedicamentFarmacie;

public class MedicamentAdapter extends MedicamentFarmacie {
    private Medicament medicament;

    public MedicamentAdapter(Medicament medicament) {
        super(medicament.getNume(), medicament.getPret());
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
        medicament.achizitioneazaMedicament();
    }
}
