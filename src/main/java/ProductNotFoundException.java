public class ProductNotFoundException extends Exception {

String exceptionMessage;

    public ProductNotFoundException(String exceptionMessage) {

        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String getMessage(){

        return exceptionMessage;
    }
}
