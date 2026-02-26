package ro.ase.cts.animale;

public abstract class Animal {
    protected String name;
    private int age;
    protected String food;
    public abstract void eat(String nume);

    public Animal(String name, int age,String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }
}
