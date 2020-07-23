package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzWhizzTest {

    @Test
    public void should_return_1_when_given_1(){
        String expected = "1";
        int input = 1;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        assertEquals(expected,fizzBuzzWhizz.playFizzBuzzWhizz(input));
    }

    @Test
    public void should_return_Fizz_when_given_3(){
        String expected = "Fizz";
        int input = 3;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        assertEquals(expected,fizzBuzzWhizz.playFizzBuzzWhizz(input));
    }

    @Test
    public void should_return_Buzz_when_given_5(){
        String expected = "Buzz";
        int input = 5;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        assertEquals(expected,fizzBuzzWhizz.playFizzBuzzWhizz(input));
    }

    @Test
    public void should_return_Whizz_when_given_7(){
        String expected = "Whizz";
        int input = 7;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        assertEquals(expected,fizzBuzzWhizz.playFizzBuzzWhizz(input));
    }

    @Test
    public void should_return_FizzBuzz_when_given_15(){
        String expected = "FizzBuzz";
        int input = 15;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        assertEquals(expected,fizzBuzzWhizz.playFizzBuzzWhizz(input));
    }

    @Test
    public void should_return_FizzBuzzWhizz_given_105(){
        String expected = "FizzBuzzWhizz";
        int input = 105;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        assertEquals(expected,fizzBuzzWhizz.playFizzBuzzWhizz(input));
    }

    @Test
    public void should_return_FizzWhizz_given_21(){
        String expected = "FizzWhizz";
        int input = 21;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        assertEquals(expected,fizzBuzzWhizz.playFizzBuzzWhizz(input));
    }

    @Test
    public void should_return_BuzzWhizz_given_35(){
        String expected = "BuzzWhizz";
        int input = 35;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        assertEquals(expected,fizzBuzzWhizz.playFizzBuzzWhizz(input));
    }
}
