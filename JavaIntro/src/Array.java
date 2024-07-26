import java.util.Arrays;

public class Array{
    public static void main(String[] args) {


        //CRUD --> Create, Read, Update, Delete

        //Create a string array
        String[] carBrands = {"Volvo", "Hyundai", "Kia" , "Audi"};

        //create an array of integes
        Integer[] carPrice = {76, 89, 90, 12, Integer.parseInt("45")};

        int[] arr = new int[] {82,46, 93,1,8,4};
//
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if(arr[i]>arr[j]){ //compareTo incase of string
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }


//        String arr[]={"hyndai","tata", "mahindra","mahindra","audi","bmw"};
//        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<arr.length;i++){
//            for (int j = i+1; j <arr.length; j++) {
//                String tem="";
//                int n=arr[j].compareTo(arr[i]);
//                if(n<0){
//                    tem=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=tem;
//                }
//
//            }
//        }
        System.out.println(Arrays.toString(arr));


        Arrays.sort(carBrands);

       for(int i = 0; i <= carBrands.length - 1 ; i++){
            System.out.println(carBrands[i]);
        }




//        System.out.println(carBrands[3]); //read an element from array

//        System.out.println(carBrands.length); //Length of array
//
//        System.out.println(Arrays.toString(carBrands)); //print array
//
//        for(int i = 0; i <= carBrands.length - 1 ; i++){
//            System.out.println(carBrands[i]);
//        } // read each element separately in an array

//        carBrands[3] = "BMW"; // updated element at position 3

//        System.out.println(carBrands[3]);

        //delete an element in an array -> convert to array list

//        int[][] numbers = {{1,2,3,4},{5,6,7,8}};
//        System.out.println(numbers[1][2]);

//        for(int[] x: numbers){
//            for(int y : x){
//                System.out.println("Your array numbers are " + y);
//            }
//        }

        //Remove element from array
//        int []arr1={1,2,3,4,5,6,7,8,9};
//        // if we want to  remove 5 (index 4)
//        int []arr2=new int[arr1.length-1];
//        int j=0;
//        for(int i=0;i<arr1.length;i++){
//            if(i==4) continue;
//            arr2[j]=arr1[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(arr2));

        //Add element into array
//
//        int arr[] = {1,2,3,4,5,6};
//        int n = arr.length;
//        int newArr[] = new int[n+1];
//        int value = 7;
//        System.out.println(Arrays.toString(arr));
//        for(int i = 0; i<n; i++) {
//            newArr[i] = arr[i];
//        }
//        newArr[n] = value;
//        System.out.println(Arrays.toString(newArr));
    }

}
