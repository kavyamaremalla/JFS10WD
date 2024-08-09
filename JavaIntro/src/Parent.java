public sealed class Parent permits Child1, Child2{

    public void display(){
        System.out.println("From Parent class");
    }
}

final class Child1 extends Parent{

    @Override
    public void display(){
        System.out.println("From Child 1");
    }
}

sealed class  Child2 extends Parent permits GrandChild{
    @Override
    public void display(){
        System.out.println("From Child 2");
    }
}

non-sealed class GrandChild extends Child2{
    @Override
    public void display(){
        System.out.println("From Grand Child of Child 2");
    }
}

class GreatGrandChild extends GrandChild{
    @Override
    public void display(){
        System.out.println("From GreatGrandChild");
    }
}

class TestConcept{
    public static void main(String[] args) {
        Parent child1 = new Child1();
        Parent child2 = new Child2();
        Parent grandChild = new GrandChild();
        Parent greatGrandChild = new GreatGrandChild();

        child1.display();
        child2.display();
        grandChild.display();
        greatGrandChild.display();
    }
}