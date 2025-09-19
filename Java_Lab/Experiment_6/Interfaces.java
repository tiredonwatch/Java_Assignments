class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Interfaces
interface Pet {
    void play();
}

interface Trainable {
    void train();
}

// Subclass extending class + implementing multiple interfaces
class Dog extends Animal implements Pet, Trainable {
    public void play() {
        System.out.println("Dog loves to play fetch.");
    }

    public void train() {
        System.out.println("Dog can be trained to follow commands.");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();     // from Animal
        d.play();    // from Pet
        d.train();   // from Trainable
    }
}
