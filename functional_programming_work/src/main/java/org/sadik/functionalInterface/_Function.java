package org.sadik.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        //Function takes 1 arguments and produces 1 results
        int increment = increment(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        //BiFunction takes 2 arguments and produces 1 results
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));

    }


  static Function<Integer, Integer> incrementByOneFunction =
          number -> number + 1;

  static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static int increment(int number ){
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne +1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply (int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }
}
