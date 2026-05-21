package ro.ase.cts.Spital.clase;

import java.util.HashMap;

public class PacientFactory {
    private HashMap<String,Pacient> listaPacienti;

    public PacientFactory() {
        this.listaPacienti = new HashMap<>();
    }
    public Pacient getPacient(String cnp,String nume,String nrTel,String adresa){
        if(!listaPacienti.containsKey(cnp)){
            listaPacienti.put(cnp,new Pacient(adresa,nrTel,nume,cnp));
        }
        return listaPacienti.get(cnp);
    }
}
