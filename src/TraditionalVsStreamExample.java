import java.util.ArrayList;
import java.util.List;

public class TraditionalVsStreamExample {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        //Traditional approach: find sum of squares for even numbers
        int sumOfSquares = 0;
        for( int number : numbers){
            if( number % 2 == 0){ //filter even numbers
                int square = number * number; // Square the number
                sumOfSquares += square; // Add to the sum
            }
        }

        System.out.println("Sum of squares (Traditional): "+ sumOfSquares);

        // Java Streams approach: find sum of squares for even numbers
        int sumOfSquares_usingStreams = numbers.stream()
                .filter(number -> number % 2 == 0) // Filter even numbers
                .mapToInt(number -> number * number)// Square the number
                .sum(); // Sum of the squared values

        System.out.println("Sum of squares (Java streams): "+ sumOfSquares_usingStreams);

    }
}
