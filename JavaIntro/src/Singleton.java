import java.util.Comparator;

public class Singleton {

    public String state;

    private static Singleton instance = null;

    private Singleton() throws Exception{
        this.state = "InitialState";
    }

    public void setInstance(String state) {
        this.state = state;
    }
    public static Singleton singletonInstance(){

           if(instance == null){
            try {
                instance = new Singleton();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

}

class TestSingleton{
    public static void main(String[] args) {
        Singleton x = Singleton.singletonInstance();
        Singleton y = Singleton.singletonInstance();

        x.setInstance(("From x"));

        y.setInstance(("From y").toUpperCase());

        System.out.println(x.state);
        System.out.println(y.state);

//        System.out.println(x);
//        System.out.println(y);


    }
}

