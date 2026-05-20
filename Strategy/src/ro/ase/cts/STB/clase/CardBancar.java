package ro.ase.cts.STB.clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(Double sumaPlatita) {
        System.out.println("S-a platit cu cardul:"+sumaPlatita);
    }
}
