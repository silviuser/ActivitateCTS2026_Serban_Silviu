package ro.ase.cts.STB2.clase;

public class CalatorieTramvai extends CalatorieHandler{
    @Override
    public String recomandaClatorie(double distanta) {
        if(distanta>=5 && distanta<10)
            return "Tramvai";
        else
            return this.handler.recomandaClatorie(distanta);
    }
}
