package lk.hadamu.exceptions;

/**
 *
 */
public class CustomerNotFoundException extends Exception {

    public CustomerNotFoundException(String userName) {
        super(String.format("No customer found for user name %s", userName));
    }
}
