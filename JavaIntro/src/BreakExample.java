public class BreakExample {

    public static void main(String[] args) {

        int x = 10; // read from scanner

        for (int i = 0; i <=x ; i++) {
            if(i==5){
//                return;
//                continue;
                break;
            }
            System.out.println(i);
        }

//        BreakExample breakExample = new BreakExample();
//        breakExample.calculateEngineCC(20, "highEnd");

        calculateEngineCC(20, "highEnd");
    }

    public static int calculateEngineCC(int weight, String carModel){
        int capacity = weight * 1000;
        System.out.println(capacity + carModel);
        return capacity;
    }
}
