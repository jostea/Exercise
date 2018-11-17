package servicePackage;
import java.util.stream.LongStream;

public class FactorialByStream {
    public static void main(String[] args) {

        long number = 1;
        while (number <= 19) {
            System.out.println(number + "!: " + LongStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y));
            number++;
        }
    }
}
