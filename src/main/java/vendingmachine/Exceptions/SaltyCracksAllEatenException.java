package vendingmachine.Exceptions;

import vendingmachine.Exceptions.ProductNotFoundException;

public class SaltyCracksAllEatenException extends ProductNotFoundException {


    public SaltyCracksAllEatenException(String exceptionMessage) {
        super(exceptionMessage);
    }
}