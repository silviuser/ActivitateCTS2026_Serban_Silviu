package ro.ase.cts.Spital.program;

import ro.ase.cts.Spital.clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new Medic("Popescu");
        PersonalSpital asistenta = new Asistent("Razvan");

        Pacient pacient1 = new Pacient("Gigel");
        Pacient pacient2 = new Pacient("Marcel");

        Command fisaPacient1 = new Internare(pacient1,medic);
        Command fisaPacient2 = new Tratare(asistenta,pacient2);

        Operator operator = new Operator();
        operator.inregistreaza(fisaPacient1);
        operator.inregistreaza(fisaPacient2);
        operator.executaFisa();

        operator.inregistreaza(
                new Tratare(
                        asistenta,
                        new Pacient("Maricica")
                )
        );

        operator.executaFisa();
        operator.executaFisa();
        operator.executaFisa();
    }
}