public class CalculateAverage {

    public static void main(String[] args) {

        int[] marks = {47, 38, 59, 67, 73, 82, 91};

        float avg, sum = 0;

        int length = marks.length;

        for(int mark : marks){
            sum += mark;
        }

        avg = sum / length;

        System.out.println(avg);

        int lowestMark = marks[0];

        for (int mark : marks){
//            if(lowestMark > mark){
//                lowestMark = mark;
//            }
            lowestMark = Math.min(lowestMark, mark);
        }



        System.out.println("Lowest Mark " + lowestMark);
    }

}
