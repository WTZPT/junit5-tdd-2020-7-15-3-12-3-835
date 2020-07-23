package junit5.tdd;

public class FizzBuzzWhizz {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String WHIZZ = "Whizz";

    public String playFizzBuzzWhizz(int input) {
        String result = "";
        if(input % 3 == 0) {
            result += FIZZ;
        }
        if(input % 5 == 0) {
            result += BUZZ;
        }
        if(input % 7 == 0){
            return WHIZZ;
        }
        return result.equals("") ? String.valueOf(input) : result;
    }
}
