package ro.ase.cts.STB2.clase;

public class CalatorieTroleibuz extends CalatorieHandler{
    @Override
    public String recomandaClatorie(double distanta) {
        if(distanta<3)
            return "TROLIEIBUZ";
        else
            return this.handler.recomandaClatorie(distanta);
    }
}
