public class InvalidProductException extends  ProductNotFoundException {
    String exceptionMessage;
    InvalidProductException(String exceptionMessage){
        super(exceptionMessage);
        this.exceptionMessage = exceptionMessage;


    }

    @Override
    public String getMessage() {
        return super.exceptionMessage;
    }
}
