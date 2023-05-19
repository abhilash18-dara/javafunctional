package finalSection;

import org.w3c.dom.ls.LSOutput;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {
        BiFunction<String,Integer, String> upperCase = (name,age) -> {
            System.out.println(age);
            if(name.isBlank()) throw new IllegalArgumentException(" Please enter your name");

            return name.toUpperCase();

        };
        System.out.println(upperCase.apply("",10));
    }



}
