package ro.ase.cts.Spital.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> listComenzi;

    public Operator() {
        this.listComenzi = new ArrayList<>();
    }

    public void inregistreaza(Command comanda){
        this.listComenzi.add(comanda);
    }
    public void executaFisa(){
        if(this.listComenzi.size()>0){
            this.listComenzi.getFirst().execute();
            this.listComenzi.removeFirst();
        }
        else {
            System.out.println("Nu exista fise in coada...");
        }
    }
}
