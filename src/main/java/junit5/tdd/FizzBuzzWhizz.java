package junit5.tdd;

public class FizzBuzzWhizz {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String WHIZZ = "Whizz";

    public String playFizzBuzzWhizz(int input) {
        if(input % 3 == 0) {
            return FIZZ;
        }
        if(input % 5 == 0) {
            return BUZZ;
        }
        if(input % 7 == 0){
            return WHIZZ;
        }
        return String.valueOf(input);
    }
}
