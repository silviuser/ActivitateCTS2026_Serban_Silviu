package ro.ase.cts.STB.program;

import ro.ase.cts.STB.prototype.IRezervare;
import ro.ase.cts.STB.prototype.Rezervare;

public class Main {
    public static void main(String[] args) throws Exception {
        IRezervare rezervare1 = new Rezervare("0720338642","10/12/2025",2,"Ionel");

        IRezervare rezervare2 = rezervare1.copiaza();
        ((Rezervare) rezervare2).setData("10/02/2026");
        ((Rezervare) rezervare2).setNrPersoane(4);

        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}