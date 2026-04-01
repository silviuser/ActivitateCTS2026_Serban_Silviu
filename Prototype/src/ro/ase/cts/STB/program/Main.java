package ro.ase.cts.STB.program;

import ro.ase.cts.STB.prototype.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("41",7,"Otokar");
        Autobuz autobuz2 = (Autobuz) autobuz.clone();
        autobuz2.setLinie("55");
        System.out.println(autobuz);
        System.out.println(autobuz2);
    }
}
