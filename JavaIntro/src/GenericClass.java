public class GenericClass<T, U> {

    T object;


    U object1;

    GenericClass(T object, U object1){
        this.object = object;
        this.object1 = object1;
    }

    GenericClass(T object){
        this.object = object;
           }

    public T getObject(){
        return this.object;
    }

    public void print(){
        System.out.println(object);
        System.out.println(object1);
    }
}

class TestGenerics {
    public static void main(String[] args) {
        GenericClass<Integer, Double> integerObject = new GenericClass<>(15);
        System.out.println(integerObject.getObject());

        GenericClass<String, Float> stringObject = new GenericClass<>("String object");
        System.out.println(stringObject.getObject());

//        integerObject = stringObject;

        GenericClass<Integer, String> genericObject = new GenericClass<>(12, "String Object");
        genericObject.print();
    }
}
