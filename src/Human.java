public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
    }

    static class Builder extends Human {
        public Builder(String name, int age) {
            super(name, age);
        }
         public void buildHouse(){
            System.out.println(name + " строит дом.");
         }
    }

    static class Sailor extends Human {
        public Sailor(String name, int age) {
            super(name, age);
        }

        public void sail() {
            System.out.println(name + " плавает на корабле. ");
        }
    }

    static class Pilot extends Human {
        public Pilot(String name, int age){
            super(name, age);
        }

        public void fly(){
            System.out.println(name + " летает на самолёте.");
        }
    }
}
