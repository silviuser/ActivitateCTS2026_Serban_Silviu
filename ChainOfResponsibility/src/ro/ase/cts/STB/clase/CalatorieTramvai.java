package ro.ase.cts.STB.clase;

public class CalatorieTramvai extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta<10)
            return "Tramvai";
        else
            return this.calatorieHandler.recomandaCalatorie(distanta);
    }
}
