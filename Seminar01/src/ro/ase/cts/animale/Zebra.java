package ro.ase.cts.animale;

public class Zebra extends Animal{
    private int nrDungi;

    public Zebra(String name, int age,String food ,int nrDungi) {
        super(name, age, food);
        this.nrDungi = nrDungi;
    }

    @Override
    public void eat( String nume) {
        System.out.println("Zookeeperul "+nume+" hraneste zebra "+ super.name + " cu "+super.food);
    }
}
