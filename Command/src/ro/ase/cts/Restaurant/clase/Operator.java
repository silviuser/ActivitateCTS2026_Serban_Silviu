package ro.ase.cts.Restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> listaComenzi = new ArrayList<>();
    public void adaugaComanda(Command comanda){
        this.listaComenzi.add(comanda);
    }
    public void executaComanda(){
        if(listaComenzi.size()>0){
            listaComenzi.removeFirst().execute();
        }else System.out.println("Nu exsita comenzi in asteptare...");
    }
}
