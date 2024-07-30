public abstract class AnimalAbstraction { //abstract class

    private int x = 9;

    public void sleep(){//normal method
        System.out.println("Animals sleep");
    }

    //abstract method
    public abstract void animalSound(String a, int b);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


}

abstract class Tiger extends AnimalAbstraction{ //child class

    AnimalAbstraction abstraction = new Pet();
//    abstract int y = 10;
    @Override //body for parent's abstract method
    public void animalSound(String a, int b) {
        //logic/implementation
        System.out.println("Tiger is an animal, makes sound");
    }

//    public static void main(String[] args) {
//        Tiger tiger = new Tiger();
////        tiger.x = 8;
//        System.out.println(tiger.x);
//        tiger.sleep();
//        tiger.animalSound("jill", 7);
//    }

    public abstract void animalHunts();
}

class Pet extends Tiger{

    @Override
    public void animalHunts() {

    }

    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.animalSound("hexagon", 6);
        pet.setX(7);
    }
}