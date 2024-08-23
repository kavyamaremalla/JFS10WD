class OuterClass{
    //write your logic
    static class NestedOrInnerClass{//nested or inner class
        //write your logic
//       types of inner class nested inner, anonymous inner, static nested, method local inner
        //inner
        public void display(){
            System.out.println("From inner class");
        }
    }
}

class TestInnerClass{
    public static void main(String[] args) {
        OuterClass.NestedOrInnerClass innerClass = new OuterClass.NestedOrInnerClass();
        innerClass.display();

        IntCalculator calculator = new IntCalculator() {

            public int add(int a, int b) {
                return 0;
            }
        };
    }
}