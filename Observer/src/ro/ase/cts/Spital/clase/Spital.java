package ro.ase.cts.Spital.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private String nume;
    private List<Pacient> lista;

    public Spital(String nume) {
        this.nume = nume;
        lista=new ArrayList<>();
    }

    @Override
    public void notifica(String mesaj) {
        lista.forEach(
                pacient->
                        pacient.receptioneazaNotificare(mesaj+" de la spitalul: "+this.nume)
        );
    }

    @Override
    public void aboneazaPacient(Pacient pacient) {
        lista.add(pacient);
    }

    @Override
    public void dezaboneazaPacient(Pacient pacient) {
        lista.remove(pacient);
    }
    public void notificaVirus(){
        this.notifica("Exista un virus nou in oras! ");
    }
    public void notificaPandemie(){
        this.notifica("Exista o pandemie nationala!");
    }
}
