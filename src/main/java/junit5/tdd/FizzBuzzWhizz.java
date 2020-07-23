package junit5.tdd;

public class FizzBuzzWhizz {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String WHIZZ = "Whizz";
    private static String EMPTY = "";

    public String playFizzBuzzWhizz(int input) {
        String result = EMPTY;
        result += checkFizz(input);
        result += checkBuzz(input);
        result += checkWhizz(input);
        return result.equals(EMPTY) ? String.valueOf(input) : result;
    }

    private String checkFizz(int input) {
        return input % 3 == 0 ? FIZZ : EMPTY;
    }

    private String checkBuzz(int input) {
        return input % 5 == 0 ? BUZZ : EMPTY;
    }

    private String checkWhizz(int input) {
        return input % 7 == 0 ? WHIZZ : EMPTY;
    }
}
