public class ObjectCreation {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        //Using new keyword, you can create an object
        BreakExample breakExample = new BreakExample();

//        BreakExample breakExample1 = (BreakExample) breakExample.clone();

        Class cls = Class.forName("BreakExample");
        ObjectCreation obj = (ObjectCreation) cls.newInstance();



    }
}
