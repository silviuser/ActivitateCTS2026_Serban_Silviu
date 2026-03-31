package ro.ase.cts.Restaurant.program;

import ro.ase.cts.Restaurant.builder.Rezervare;

public class Main {
    public static void main(String[] args) {
//        Rezervare rezervare = new Rezervare();
        Rezervare rezervare = Rezervare.builder()
                .setDecorareMese("floral")
                .setHasAsezareLaGeam(true)
                .setGenMuzica("populare")
                .build();
        System.out.println(rezervare);
        Rezervare rezervare2 = Rezervare.builder().build();
        System.out.println(rezervare2);
    }
}
