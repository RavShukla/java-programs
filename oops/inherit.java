class Animal {
    void eat() {
        System.out.println("Animal is eating food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inherit {
    public static void main(String[] args) {

        // 👉 create object here
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}