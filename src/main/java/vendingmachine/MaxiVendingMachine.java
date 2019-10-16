package vendingmachine;




import vendingmachine.Exceptions.InvalidProductException;
import vendingmachine.Exceptions.NumberMustBeGreaterThanZero;
import vendingmachine.Products.Chocolates;
import vendingmachine.Products.SaltySnacks;
import vendingmachine.Products.SoftDrinks;


public class MaxiVendingMachine extends VendingMachine {



public void addStock(SaltySnacks saltySnacks)throws InvalidProductException , NumberMustBeGreaterThanZero {

    if (saltySnackAvailable() > 0){

        saltySnackAvailable();

        System.out.println();
    }else {
        throw new NumberMustBeGreaterThanZero("ooooooooooooooo");
    }


}
public void buy(SaltySnacks saltySnacks){

    saltySnackAvailableBuy();
}

public void addStock(SoftDrinks softDrinks){

    softDrinksAvailable();
}

public void addStock(Chocolates chocolates){

    chocolatesAvailable();

}

}
