package july22;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class overiddenanimalandcat {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Animal c = new Cat();
        c.makeSound();
    }
}
