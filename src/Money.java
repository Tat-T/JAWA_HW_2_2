public class Money {
    public int wholePart; //целая часть
    public int fractionalPart;//дробная
    private final String currency;//валюта

    public Money (int wholePart, int fractionalPart, String currency) {
        this.wholePart = wholePart;
        this.fractionalPart = fractionalPart;
        this.currency = currency;
    }

    public void displayAmount() {
        System.out.println(wholePart + "." + fractionalPart + " " + currency);
    }

    public void setValues(int whole, int fractional) {
        this.wholePart = whole;
        this.fractionalPart = fractional;
    }
}


