package ro.ase.cts.STB.clase;

public class SMS implements ModPlata{
    @Override
    public void plateste(Double sumaPlatita) {
        System.out.println("S a platit prin SMS: "+sumaPlatita);
    }
}
