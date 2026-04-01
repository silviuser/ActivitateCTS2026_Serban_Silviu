package ro.ase.cts.STB.program;

import ro.ase.cts.STB.builder.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie autobuzLinie = AutobuzLinie.builder().build();
        System.out.println(autobuzLinie);
        AutobuzLinie autobuzLinie2 = AutobuzLinie.builder()
                .setDeschideUsileAutomat(true)
                .setModel("Mercedes")
                .build();
        System.out.println(autobuzLinie2);
    }
}
