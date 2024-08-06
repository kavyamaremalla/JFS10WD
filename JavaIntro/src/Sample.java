public class Sample {

    Sample(){ // no arg constructor
        System.out.println("No argument Constructor");
    }

    Sample(String str){ // one arg constructor
        System.out.println("Parameterized Constructor " + str);
    }


    public static void main(String[] args) {
        //constructor ref for a no-arg/default constructor
        SampleInterface sampleInterface = Sample::new;
        sampleInterface.add();

        //constructor ref for an argumented/parameterised constructor
        SampleInterfaceWithArg interfaceWithArg = Sample::new;
        interfaceWithArg.add("Random String");
    }
}

interface SampleInterface {
    Sample add();
}

interface SampleInterfaceWithArg {
    Sample add(String str);
}
