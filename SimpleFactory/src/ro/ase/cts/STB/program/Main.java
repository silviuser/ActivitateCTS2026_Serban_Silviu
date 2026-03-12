package ro.ase.cts.STB.program;

import ro.ase.cts.STB.factory.MijlocTransportFactory;
import ro.ase.cts.STB.factory.MijlocTransportType;
import ro.ase.cts.STB.vehicule.MijlocTransport;

import javax.sound.midi.MidiChannel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void afisareDescriere(MijlocTransport mijlocTransport)
    {
        System.out.println(mijlocTransport);
    }

    public static void main(String[] args) throws Exception {
//        MijlocTransportFactory factory = new MijlocTransportFactory();
        MijlocTransport autobuz = MijlocTransportFactory.getMijlocTransport(
                "Mercedes",
                432,
                MijlocTransportType.AUTOBUZ
        );
        MijlocTransport tramvai = MijlocTransportFactory.getMijlocTransport(
                "Astra",
                101,
                MijlocTransportType.TRAMVAI
        );
        MijlocTransport troleibuz = MijlocTransportFactory.getMijlocTransport(
                "Otokar",
                44,
                MijlocTransportType.TROLEIBUZ
        );
        afisareDescriere(autobuz);
        afisareDescriere(tramvai);
        afisareDescriere(troleibuz);

    }
}