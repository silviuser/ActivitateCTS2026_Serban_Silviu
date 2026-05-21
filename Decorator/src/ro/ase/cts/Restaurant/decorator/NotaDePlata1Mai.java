package ro.ase.cts.Restaurant.decorator;

import ro.ase.cts.Restaurant.clase.NotaDePlataAbstract;

public class NotaDePlata1Mai extends NotaDePlataDecorator{
    public NotaDePlata1Mai(NotaDePlataAbstract produsDecorat) {
        super(produsDecorat);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de 1 mai");
    }
}
