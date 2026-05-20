package ro.ase.cts.STB2.clase;

public abstract class CalatorieHandler {
    protected CalatorieHandler handler=null;

    public CalatorieHandler() {
    }

    public void setHandler(CalatorieHandler handler) {
        this.handler = handler;
    }

    public abstract String recomandaClatorie(double distanta);
}
