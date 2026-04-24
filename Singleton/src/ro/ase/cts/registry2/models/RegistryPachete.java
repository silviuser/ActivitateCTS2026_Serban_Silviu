package ro.ase.cts.registry2.models;

import java.util.HashMap;
import java.util.Map;

public class RegistryPachete {
    private RegistryPachete(){}
    private static Map<String,PachetTuristic> registru=new HashMap<>();
    public static void register(String nume, PachetTuristic value){
        if(registru.containsKey(nume)){
            throw new RuntimeException("exista deja pachetul "+ nume);
        }else{
            registru.put(nume,value);
        }
    }
    public static PachetTuristic getPachet(String nume){
        return registru.get(nume);
    }
}
