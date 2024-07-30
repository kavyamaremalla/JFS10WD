public class InValidAgeException extends Exception{ //custom exception

    public InValidAgeException(String message){
        //calling Parent's constructor
        super(message);
    }
}

class TestCustomException{

    static void validateAge(int age) throws InValidAgeException{
        if(age < 18 ){
            throw new InValidAgeException("You are not eligible to vote!");
        }else{
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(17);
            throw new InValidAgeException("thrown");
        } catch (InValidAgeException e) {
            System.out.println("Exception caught : " + e.getMessage());
        }

        System.out.println("Finished execution");
    }
}