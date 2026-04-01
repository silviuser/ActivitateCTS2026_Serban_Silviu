package ro.ase.cts.STB.builder;

public class AutobuzLinie {
    private String model;
    private String sofer;
    private boolean hasOpririCapatDeLinie;
    private boolean deschideUsileAutomat;
    private String textAfisat;

    private AutobuzLinie(AutobuzLinieBuilder builder) {
        this.model = builder.model;
        this.sofer = builder.sofer;
        this.hasOpririCapatDeLinie = builder.hasOpririCapatDeLinie;
        this.deschideUsileAutomat = builder.deschideUsileAutomat;
        this.textAfisat = builder.textAfisat;
    }

    public String getModel() {
        return model;
    }

    public String getSofer() {
        return sofer;
    }

    public boolean isHasOpririCapatDeLinie() {
        return hasOpririCapatDeLinie;
    }

    public boolean isDeschideUsileAutomat() {
        return deschideUsileAutomat;
    }

    public String getTextAfisat() {
        return textAfisat;
    }
    public static AutobuzLinieBuilder builder(){
        return new AutobuzLinieBuilder();
    }
    public static class AutobuzLinieBuilder implements AbstractBuilder{
        private String model = "Model default";
        private String sofer = "Default";
        private boolean hasOpririCapatDeLinie = false;
        private boolean deschideUsileAutomat = false;
        private String textAfisat = "";

        public AutobuzLinieBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public AutobuzLinieBuilder setSofer(String sofer) {
            this.sofer = sofer;
            return this;
        }

        public AutobuzLinieBuilder setHasOpririCapatDeLinie(boolean hasOpririCapatDeLinie) {
            this.hasOpririCapatDeLinie = hasOpririCapatDeLinie;
            return this;
        }

        public AutobuzLinieBuilder setDeschideUsileAutomat(boolean deschideUsileAutomat) {
            this.deschideUsileAutomat = deschideUsileAutomat;
            return this;
        }

        public AutobuzLinieBuilder setTextAfisat(String textAfisat) {
            this.textAfisat = textAfisat;
            return this;
        }

        @Override
        public AutobuzLinie build() {
            return new AutobuzLinie(this);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", hasOpririCapatDeLinie=").append(hasOpririCapatDeLinie);
        sb.append(", deschideUsileAutomat=").append(deschideUsileAutomat);
        sb.append(", textAfisat='").append(textAfisat).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
