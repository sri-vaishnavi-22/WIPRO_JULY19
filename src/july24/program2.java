package july24;

// Define the Animal interface
interface Animal {
    void bark();
}

// Dog class implementing Animal
class Dog implements Animal {

    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class program2 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.bark();
    }
}
