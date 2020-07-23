package junit5.tdd;

public class FizzBuzzWhizz {

    private static  String FIZZ = "Fizz";

    public String playFizzBuzzWhizz(int input) {
        if(input % 3 == 0){
            return FIZZ;
        }
        return String.valueOf(input);
    }
}
