//Runtime polymorphism
public class Animal {//parent class
    void eat(){
        System.out.println("Eating from Animal class");
    }
}

class Dog extends Animal{ //sub class 1
    @Override
    void eat() {
        System.out.println("Eating from Dog class");
    }
}

class Cat extends Animal{ //sub class 2

    void eat() {
        System.out.println("Eating from Cat class");
    }
}

class Lion extends Animal{ //sub class 3

    void eat() {
        System.out.println("Eating from Lion class");
    }
}

class TestRunTimePolymorphism{

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

        animal = new Dog();
        animal.eat();

        animal = new Cat();
        animal.eat();

        animal = new Lion();
        animal.eat();
    }
}