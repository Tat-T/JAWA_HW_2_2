public class Animal {
    String name;
    String characteristic;

    public Animal(String name, String characteristic) {
        this.name = name;
        this.characteristic = characteristic;
    }

    public void describe() {
        System.out.println(name + " - " + characteristic);
    }
static class Tiger extends Animal{
    public Tiger(){
        super("Тигр", "хищник");
    }
}
static class Kangaroo extends Animal{
    public Kangaroo(){
        super("Кенгуру", "сумчатое");
    }
}
static class Crocodile extends Animal {
    public Crocodile(){
        super("Крокодил", "рептилия");
    }
}
}



