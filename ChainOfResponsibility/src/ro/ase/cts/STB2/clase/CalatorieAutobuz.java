package ro.ase.cts.STB2.clase;

public class CalatorieAutobuz extends CalatorieHandler{
    @Override
    public String recomandaClatorie(double distanta) {
        if(distanta>=3 && distanta<5)
            return "Autobuz";
        else
            return this.handler.recomandaClatorie(distanta);
    }
}
