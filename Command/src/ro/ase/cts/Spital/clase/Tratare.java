package ro.ase.cts.Spital.clase;

public class Tratare implements Command{
    private PersonalSpital asistenta;
    private Pacient pacient;

    public Tratare(PersonalSpital asistenta, Pacient pacient) {
        this.asistenta = asistenta;
        this.pacient = pacient;
    }
    @Override
    public void execute() {
        this.asistenta.preluarePacient(this.pacient);
    }
}
