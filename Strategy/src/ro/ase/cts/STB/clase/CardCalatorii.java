package ro.ase.cts.STB.clase;

public class CardCalatorii implements ModPlata{
    @Override
    public void plateste(Double sumaPlatita) {
        System.out.println("S-a efectuat plata prin card de calatorii in val de: "+sumaPlatita);
    }
}
