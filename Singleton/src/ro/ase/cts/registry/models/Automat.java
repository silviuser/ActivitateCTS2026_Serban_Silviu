package ro.ase.cts.registry.models;

import java.util.HashMap;
import java.util.Map;

public class Automat {
    private int codStatie;
    private Automat(int codStatie){
        this.codStatie = codStatie;
    }
    private static final Map<Integer,Automat> instante = new HashMap<>();

    public static synchronized Automat getInstance(int codStatie){
        if(!instante.containsKey(codStatie)){
            instante.put(codStatie,new Automat(codStatie));
        }
        return instante.get(codStatie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Automat{");
        sb.append("codStatie=").append(codStatie);
        sb.append('}');
        return sb.toString();
    }
}
