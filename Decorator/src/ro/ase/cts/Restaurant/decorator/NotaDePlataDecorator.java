package ro.ase.cts.Restaurant.decorator;

import ro.ase.cts.Restaurant.clase.NotaDePlataAbstract;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstract {
    private NotaDePlataAbstract produsDecorat;

    public NotaDePlataDecorator(NotaDePlataAbstract produsDecorat) {
        this.produsDecorat = produsDecorat;
    }

    @Override
    public void printeaza() {
        this.produsDecorat.printeaza();
    }

    public abstract void printeazaFelicitare();
}
