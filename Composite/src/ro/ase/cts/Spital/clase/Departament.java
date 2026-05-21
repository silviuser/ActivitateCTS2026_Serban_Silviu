package ro.ase.cts.Spital.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String numeDepartament;
    private List<Structura> substructuri;

    public Departament(String numeDepartament) {
        this.substructuri = new ArrayList<>();
        this.numeDepartament = numeDepartament;
    }
    public void adaugaStructura(Structura structura){
        this.substructuri.add(structura);
    }
    public void stergeStructura(Structura structura){
        this.substructuri.remove(structura);
    }
    public Structura getStructura(int index){
        return substructuri.get(index);
    }
    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+" Nume departanet "+this.numeDepartament);
        System.out.println("SUBDEPARTAMENTE");
        for(Structura s:substructuri){
            s.afiseazaDetaliiStructura(spatii+ " ");
        }
    }

}
