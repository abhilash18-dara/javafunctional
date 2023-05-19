package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidationService {


    public boolean isEmailValid(String email){
        return email.contains("@");
    }

    public boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("+1");
    }
    public boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 24;
    }
    public boolean isValidCustomer(Customer customer){
        return isEmailValid(customer.getEmail()) &&
                isPhoneNumberValid(customer.getPhoneNumber()) &&
                isAdult(customer.getDob());
    }

}
