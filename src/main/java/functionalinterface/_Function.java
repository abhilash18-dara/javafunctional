package functionalinterface;

import java.net.InterfaceAddress;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function - it takes one parameter and give one output
        int increment = increment(1);
        System.out.println(increment);
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        Function<Integer, Integer> addBy1ThenMultiply = incrementByOneFunction.andThen(multiplyByOneFunction);
        System.out.println(addBy1ThenMultiply.apply(1));



        //BiFunction - Takes two parameters and gives one output
        System.out.println(incremntByOneAndMultiplyBiFunction.apply(1,5));



    }
    //Declarative approach
    //Function

   static Function<Integer, Integer> incrementByOneFunction = number -> number +  1;
    static Function<Integer, Integer> multiplyByOneFunction = number -> number * 10;

    //BiFunction
    static BiFunction<Integer,Integer, Integer> incremntByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) *numberToMultiplyBy;


    //imperative approach
    static int increment(int number){
        return number + 1;

    }
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }
}
