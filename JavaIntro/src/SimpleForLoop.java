public class SimpleForLoop {

    public static void main(String[] args) {

//        System.out.println("Started for loop execution");
//
//        for(int i = 5; i <10; i++){
//            System.out.println(i);
//        }
//
//        System.out.println("For loop ended");



        int[] arrayOfNumbers = {1,2,51,62,86,98};

        for(int integerValue : arrayOfNumbers){
            System.out.println(integerValue);
        }

        System.out.println("*******************************************");

        for (int i=0; i < arrayOfNumbers.length ; i++){
            System.out.println(arrayOfNumbers[i]);
        }
    }
}
