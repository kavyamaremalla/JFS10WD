public class StringPool {

    public static void main(String[] args) {
        String str1 = new String("Java"); //using new keyword
        String str2 = new String("Java").intern();

        String str4 = "Java"; //literal
        String str5 = "Java";

//        System.out.println(str4 == str5);//true

        System.out.println(str1 == str4);//false

        System.out.println(str1.equals(str4));//true

//        System.out.println(str4 == str2);//true
//
//        System.out.println(str2 == str1);


    }





}
