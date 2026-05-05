package ro.ase.cts.Spital.clase;

public interface ISpital {
    void notifica(String mesaj);
    void aboneazaPacient(Pacient pacient);
    void dezaboneazaPacient(Pacient pacient);

}
