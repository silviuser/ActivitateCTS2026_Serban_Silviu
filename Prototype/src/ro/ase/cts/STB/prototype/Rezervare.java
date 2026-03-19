package ro.ase.cts.STB.prototype;

public class Rezervare implements IRezervare{
    private String numeClient;
    private int nrPersoane;
    private String data;
    private String nrTelefon;

    private Rezervare() {
    }

    public Rezervare(String nrTelefon, String data, int nrPersoane, String numeClient) throws Exception {
        if(nrTelefon.length()>9 && nrTelefon.length()<11){
            this.nrTelefon = nrTelefon;
        }else throw new Exception("Numar invalid de telefon");
        this.data = data;
        if(nrPersoane>0){
            this.nrPersoane = nrPersoane;
        }else throw new Exception("Numar invalid de persoane");
        if (numeClient.length()>=3){
            this.numeClient = numeClient;
        }else this.numeClient = "Client";
    }
    @Override
    public IRezervare copiaza() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.data = this.data;
        rezervareNoua.nrTelefon = this.nrTelefon;
        rezervareNoua.nrPersoane = this.nrPersoane;
        return (IRezervare) rezervareNoua;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNrPersoane(int nrPersoane) throws Exception {
        if(nrPersoane>0){
            this.nrPersoane = nrPersoane;
        }else throw new Exception("Numar invalid de persoane");    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", data='").append(data).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
