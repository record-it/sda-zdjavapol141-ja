package pl.sda.pol141.day2.exceptions;

public class NoFieldToInEmailException extends RuntimeException{
    public NoFieldToInEmailException(String message) {
        super(message);
    }
}
