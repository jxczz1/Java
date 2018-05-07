package co.s4n.fizzbuzz;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    /* test data
    1 == 1
    2 == 2
    3 == Fizz
    4 == 4
    5 == Buzz
    6 == Fizz
    7 == 7
    8 == 8
    9 == Fizz
    10== Buzz
    12==Fizz
    13=13
    14=14
    20==Buzz
    30 == FizzBuzz
    60 == FizzBuzz
    100 == Buzz
     */
    
    @Test
    public void checkAcceptanceCriteria() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));
        Assert.assertEquals("Fizz", fizzBuzz.convert(3));
        Assert.assertEquals("4", fizzBuzz.convert(4));
        Assert.assertEquals("Buzz", fizzBuzz.convert(5));
        Assert.assertEquals("Fizz", fizzBuzz.convert(6));
        Assert.assertEquals("7", fizzBuzz.convert(7));
        Assert.assertEquals("8", fizzBuzz.convert(8));
        Assert.assertEquals("Fizz", fizzBuzz.convert(9));
        Assert.assertEquals("Buzz", fizzBuzz.convert(10));
        Assert.assertEquals("11", fizzBuzz.convert(11));
        Assert.assertEquals("Fizz", fizzBuzz.convert(12));
        Assert.assertEquals("13", fizzBuzz.convert(13));
        Assert.assertEquals("14", fizzBuzz.convert(14));
        Assert.assertEquals("Buzz", fizzBuzz.convert(20));
        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(30));
        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(60));
        Assert.assertEquals("16", fizzBuzz.convert(16));
        Assert.assertEquals("Buzz", fizzBuzz.convert(100));

    }

    @Test
    public void multiplesOfThreeAreFizz() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && !(i % 5 == 0)) {
                assertEquals("Fizz", fizzBuzz.convert(i));
            }
        }
    }

    @Test
    public void multiplesOfFiveAreBuzz() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        for (int i = 1; i <= 100; i++) {
            if (!(i % 3 == 0) && (i % 5 == 0)) {
                assertEquals("Buzz", fizzBuzz.convert(i));
            }
        }
    }

    @Test
    public void multiplesOfThreeAndFiveAreFizzBuzz() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                assertEquals("FizzBuzz", fizzBuzz.convert(i));
            }
        }
    }

    @Test
    public void checkAllNumbers() {

        boolean isMultipleOfThree;
        boolean isMultipleOfFive;
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        for (int checkThis = 1; checkThis <= 100; checkThis++) {

            String expectedVal = String.valueOf(checkThis);

            isMultipleOfFive = checkThis % 5 == 0;
            isMultipleOfThree = checkThis % 3 == 0;

            if (isMultipleOfFive && isMultipleOfThree) {
                expectedVal = "FizzBuzz";
            } else {
                if (isMultipleOfFive) {
                    expectedVal = "Buzz";
                } else {
                    if (isMultipleOfThree) {
                        expectedVal = "Fizz";
                    }
                }
            }

            System.out.println(fizzBuzz.convert(checkThis));
            Assert.assertEquals(expectedVal, fizzBuzz.convert(checkThis));

        }

    }

}
