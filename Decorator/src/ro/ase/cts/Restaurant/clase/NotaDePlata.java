package ro.ase.cts.Restaurant.clase;

public class NotaDePlata implements NotaDePlataAbstract{
    private double suma;
    private String data;

    public NotaDePlata(String data, double suma) {
        this.data = data;
        this.suma = suma;
    }

    @Override
    public void printeaza() {
        System.out.println("La data de:"+this.data+" a fost emisa plata in valoare de: "+this.suma);
    }
}
