package ro.ase.cts.STB.prototype;

public class Autobuz implements PrototypeAutobuz{
    private String marca;
    private int consum;
    private String linie;

    public void setMarca(String marca) {
        if(marca.length()>3)
        {
            this.marca = marca;
        }else this.marca="Default value";
    }

    public void setConsum(int consum) {
        if(consum>=1){
            this.consum = consum;
        }else {
            this.consum = 1;
        }
    }

    public void setLinie(String linie) {
        if(linie.length()>1){
            this.linie = linie;
        }else {
            this.linie = "Default line";
        }
    }

    public Autobuz(String linie, int consum, String marca) {
        this.setLinie(linie);
        this.setConsum(consum);
        this.setMarca(marca);
    }

    private Autobuz() {
    }

    @Override
    public PrototypeAutobuz clone() {
        Autobuz clona = new Autobuz();
        clona.consum = this.consum;
        clona.marca = this.marca;
        clona.linie = this.linie;
        return clona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", consum=").append(consum);
        sb.append(", linie='").append(linie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
