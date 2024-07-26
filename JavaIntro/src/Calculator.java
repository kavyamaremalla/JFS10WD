//Compile time polymorphism
public class Calculator {

    public int add(int a , int b){
        return  a + b;
    }

    public double add(double a , double b){
        return  a + b;
    }

    public int add(int a , int b, int c){
        return  a + b + c;
    }

    public void sum(int a , double b){
        System.out.println("First Method invoked");
    }

    public void sum(double a , int b){
        System.out.println("Second Method invoked");
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1,2));
        System.out.println(calc.add(2.5, 3.5));
        System.out.println(calc.add(1,2,3));

//        calc.sum(20,20); // leads to ambiguity

    }
}
