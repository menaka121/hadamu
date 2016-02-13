package lk.hadamu.exceptions;

/**
 * Created by menaka on 2/13/16.
 */
public class CustomerCouldNotCreateException extends Exception {

    public CustomerCouldNotCreateException(String userName) {
        super(String.format("No customer could not be created for user name %s", userName));
    }
}
