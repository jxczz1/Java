package co.s4n.fizzbuzz;
//Fizzbuzz

import java.util.stream.IntStream;
//Input: number generated from 1 to 100
//Output: print numbers submitted except:
//   if divisable by 3 - write fizz
//   if divisable by 5 - write buzz
//   if divisable by 15 - write fizzbuzz

public class FizzBuzzConverter {

    public static void main(String[] args) {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        IntStream.rangeClosed(1, 100).mapToObj(
                i -> fizzBuzz.convert(i))
                .forEach(System.out::println);
    }

    public String convert(int toConvertToFizzBuzz) {

        if (toConvertToFizzBuzz % 15 == 0) {
            return "FizzBuzz";
        }

        if (toConvertToFizzBuzz % 5 == 0) {
            return "Buzz";
        }

        if (toConvertToFizzBuzz % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(toConvertToFizzBuzz);
    }

}
