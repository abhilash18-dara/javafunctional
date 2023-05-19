package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegisterValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Abhilash",
                "11234567890",
                "abhilashdara@gmail.com",
                LocalDate.of(2000, 05, 30)
        );
      /* CustomerValidationService validationService  = new CustomerValidationService();

        System.out.println(validationService.isValidCustomer(customer));
       ;*/
        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isAnAdult())
                .and(isPhoneNumberValid())
                .apply(customer);

        System.out.println(result);
        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
