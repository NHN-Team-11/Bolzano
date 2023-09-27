package Chapter9.이중민;

public class ExceptionLineTooLong extends RuntimeException {

    public ExceptionLineTooLong () {
        super("The string is too long");

    }
    
}
