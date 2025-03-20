public class Device {
 String name;
 String description;

 public Device(String name, String description) {
     this.name = name;
     this.description = description;
 }

 public void sound() {
     System.out.println(name + " издаёт звук.");
 }

 public void show() {
     System.out.println("Устройство: " + name);
 }

 public void desc() {
     System.out.println("Описание: " + description);
 }
}

class Kettle extends Device {
    public Kettle() {
        super("Чайник", "Кипятить воду.");
    }
}

class  Microwave extends Device {
    public Microwave() {
        super("Микроволновка" , " Разогрев еды с помощью микроволн.");
    }
}

class Car extends Device {
    public Car() {
        super("Автомобиль", "Транспортное средство.");
    }
}

class Steamboat extends Device {
    public Steamboat() {
        super("Пароход", "Судно, работабщее на паровой тяге.");
    }
}