public class DemoAccessModifiers {

    public static void main(String[] args) {
        //create object for class to use the variables/methods inside a class
        AccessModifiers accessModifiers = new AccessModifiers();

        accessModifiers.firstName = "John"; //set a variable from another class
        accessModifiers.isMarried = true;
        accessModifiers.age = 26;
//        accessModifiers.sala

        accessModifiers.printPersonDetails();
    }



}
