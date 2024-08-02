public interface AnimalInterface extends FunctionalInterfaceDemo{//interface

    int x = 1;

     void sleep();//abstract method


    //abstract method
      void animalSound(String a, int b);


}

 interface AnimalInterface1 {//interface

    int y = 2;
    void eat();//normal method


    //abstract method
    void animalSound(String a, int b);
}

class Horse implements AnimalInterface, AnimalInterface1 {

//    AnimalInterface animalInterface = new Horse();

    public void sleep() {
        int x1 = AnimalInterface.x;
        System.out.println(x1);
        System.out.println("Horse sleeps");
    }


    @Override
    public void eat() {

    }

    public void animalSound(String a, int b) {
        System.out.println("horses shout");
    }

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.animalSound("shouts", 10);
        horse.sleep();


    }
}