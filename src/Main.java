public class Main {
    public static void main(String[] args) {
        Human.Builder builder = new Human.Builder("Алексей", 35);
        Human.Sailor sailor = new Human.Sailor("Иван", 40);
        Human.Pilot pilot = new Human.Pilot("Сергей", 30);

        builder.introduce();
        builder.buildHouse();

        sailor.introduce();
        sailor.sail();

        pilot.introduce();
        pilot.fly();

        Animal.Tiger tiger = new Animal.Tiger();
        Animal.Crocodile crocodile = new Animal.Crocodile();
        Animal.Kangaroo kangaroo = new Animal.Kangaroo();

        tiger.describe();
        crocodile.describe();
        kangaroo.describe();

        Money money = new Money(10, 50, "USD");
        Product product = new Product("Телефон", money);

        product.displayProduct();
        product.decreasePrice(2, 30);
        product.displayProduct();

        Device[] devices = {new Kettle(), new Microwave(), new Car(), new Steamboat()};
        for (Device device : devices) {
            device.show();
            device.sound();
            device.desc();
            System.out.println();
        }


    }
}