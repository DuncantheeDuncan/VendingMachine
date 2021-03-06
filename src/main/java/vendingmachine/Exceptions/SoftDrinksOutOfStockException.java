package vendingmachine.Exceptions;

public class SoftDrinksOutOfStockException extends ProductNotFoundException {
    String exceptionMessage;

    public SoftDrinksOutOfStockException(String exceptionMessage) {
        super(exceptionMessage);
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String getMessage() {
        return super.exceptionMessage;
    }
}