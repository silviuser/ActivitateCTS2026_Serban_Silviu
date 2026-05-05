package ro.ase.cts.Spital.clase;

public class Internare implements Command{
    private PersonalSpital medic;
    private Pacient pacient;

    public Internare(Pacient pacient, PersonalSpital medic) {
        this.pacient = pacient;
        this.medic = medic;
    }

    @Override
    public void execute() {
        this.medic.preluarePacient(this.pacient);
    }
}
