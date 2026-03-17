package ro.ase.cts.Spital.builder02;

public class Internare {
    private String nume;
    private boolean hasPatRabatabil;
    private boolean hasMicDeJun;
    private boolean hasPapuciCamera;
    private boolean hasHalat;
    public Internare(){
        this.hasPatRabatabil = false;
        this.hasHalat = false;
        this.hasPapuciCamera = false;
        this.hasMicDeJun = false;
        this.nume = "";
    }

    public Internare(String nume, boolean hasPatRabatabil, boolean hasMicDeJun, boolean hasPapuciCamera, boolean hasHalat) {
        this.nume = nume;
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDeJun = hasMicDeJun;
        this.hasPapuciCamera = hasPapuciCamera;
        this.hasHalat = hasHalat;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
    }

    public void setHasMicDeJun(boolean hasMicDeJun) {
        this.hasMicDeJun = hasMicDeJun;
    }

    public void setHasPapuciCamera(boolean hasPapuciCamera) {
        this.hasPapuciCamera = hasPapuciCamera;
    }

    public void setHasHalat(boolean hasHalat) {
        this.hasHalat = hasHalat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", hasPatRabatabil=").append(hasPatRabatabil);
        sb.append(", hasMicDeJun=").append(hasMicDeJun);
        sb.append(", hasPapuciCamera=").append(hasPapuciCamera);
        sb.append(", hasHalat=").append(hasHalat);
        sb.append('}');
        return sb.toString();
    }
}
