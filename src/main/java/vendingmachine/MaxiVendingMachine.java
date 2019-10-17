package vendingmachine;

import vendingmachine.Exceptions.InvalidProductException;
import vendingmachine.Exceptions.NumberMustBeGreaterThanZero;
import vendingmachine.Exceptions.SaltyCracksAllEatenException;
import vendingmachine.Products.Chocolates;
import vendingmachine.Products.SaltySnacks;
import vendingmachine.Products.SoftDrinks;


public class MaxiVendingMachine extends VendingMachine {


public void addStock(SaltySnacks saltySnacks)throws  NumberMustBeGreaterThanZero {
    saltySnackAvailableAdd();
    if (saltySnackAvailable() < 1)
        throw new NumberMustBeGreaterThanZero("you can't add a zero stock");
}



public void buy(SaltySnacks saltySnacks) throws SaltyCracksAllEatenException {

   if (saltySnackAvailable() <1)
       throw new SaltyCracksAllEatenException("no more snacks left");

   saltySnackAvailableBuy();

}

public void getStock(SaltySnacks saltySnacks){

    System.out.println("Available salty snacks "+saltySnackAvailable());


}

}
