package junit5.tdd;

public class FizzBuzzWhizz {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";

    public String playFizzBuzzWhizz(int input) {
        if(input % 3 == 0) {
            return FIZZ;
        }
        if(input % 5 == 0) {
            return BUZZ;
        }
        return String.valueOf(input);
    }
}
