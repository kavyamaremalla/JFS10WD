public class Bike extends Vehicle{

    private String modelName = "c1z";


    public static void main(String[] args) {
        Bike  bike = new Bike(); //bike object

        bike.applyBrakes();

        bike.brand = "hero";



        System.out.println(bike.modelName + " " + bike.brand + " " + bike.condition);
    }

    public void applyBrakes(){ //method
        super.applyBrakes();//calls parent class method
//        super.brand = "newBrand";
        super.condition = "while";
        System.out.println("Brakes Applied from bike!");
    }

}

