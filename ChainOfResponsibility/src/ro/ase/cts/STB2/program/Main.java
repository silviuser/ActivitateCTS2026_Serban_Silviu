package ro.ase.cts.STB2.program;

import ro.ase.cts.STB2.clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler autobuz = new CalatorieAutobuz();
        CalatorieHandler metrou = new CalatorieMetrou();
        CalatorieHandler tramvai = new CalatorieTramvai();
        CalatorieHandler troileibuz = new CalatorieTroleibuz();
        troileibuz.setHandler(autobuz);
        autobuz.setHandler(tramvai);
        tramvai.setHandler(metrou);

        System.out.println(autobuz.recomandaClatorie(6));

    }
}
