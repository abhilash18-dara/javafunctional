package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValidPredicate.test("211234567891"));
        System.out.println(isPhoneNumberValidPredicate.or(contains3).test("211234567891"));

    }
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("21") && phoneNumber.length() == 10;
    static Predicate<String> contains3 = phoneNubmer -> phoneNubmer.contains("3");
}
