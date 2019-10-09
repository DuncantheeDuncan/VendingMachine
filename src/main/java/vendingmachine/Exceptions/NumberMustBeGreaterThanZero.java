package vendingmachine.Exceptions;

public class NumberMustBeGreaterThanZero extends ProductNotFoundException {
String exceptionMessage;
    public NumberMustBeGreaterThanZero(String exceptionMessage){

        super(exceptionMessage);
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String getMessage() {
        return super.exceptionMessage;
    }
}
