package ro.ase.cts.Restaurant.decorator;

import ro.ase.cts.Restaurant.clase.NotaDePlataAbstract;

public class NotaDePlataFelicitare extends NotaDePlataDecorator{
    public NotaDePlataFelicitare(NotaDePlataAbstract produsDecorat) {
        super(produsDecorat);
    }
    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani!!!!");
    }
}
