package combinatorpattern;

import com.sun.net.httpserver.Authenticator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegisterValidator extends
        Function<Customer, CustomerRegisterValidator.ValidationResult> {

    static CustomerRegisterValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ?
                ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static CustomerRegisterValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().startsWith("+1") ?
                ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegisterValidator isAnAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ?
                ValidationResult.SUCCESS : ValidationResult.NOT_AN_ADULT;
    }

    default CustomerRegisterValidator and(CustomerRegisterValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;


        };
    }



    enum ValidationResult {
        SUCCESS,
        EMAIL_NOT_VALID,
        PHONE_NUMBER_NOT_VALID,
        NOT_AN_ADULT

    }
}
