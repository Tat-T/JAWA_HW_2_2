public class Product {
    private final String name;
    private final Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public void decreasePrice(int whole, int fractional) {
        price.setValues(price.wholePart - whole, price.fractionalPart - fractional);
    }

    public void displayProduct() {
        System.out.println(name + " - Цена: ");
        price.displayAmount();
    }
}
