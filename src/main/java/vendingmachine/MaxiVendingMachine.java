package vendingmachine;

import vendingmachine.Exceptions.InvalidProductException;
import vendingmachine.Exceptions.SoftDrinksOutOfStockException;
import vendingmachine.Products.Chocolates;
import vendingmachine.Products.Product;
import vendingmachine.Products.SaltySnacks;
import vendingmachine.Products.SoftDrinks;

public class MaxiVendingMachine extends VendingMachine {
 int softDrinksAvailable = 0;
 String productName = null;

    public void buy(SaltySnacks saltySnacks) {


    }

    public void buy(Chocolates chocolates) {


    }

    public void buy(SoftDrinks softDrinks, int bought) throws SoftDrinksOutOfStockException {
//        softDrinks.buy(bought);
        productName = "Soft Drinks";
        softDrinksAvailable -= bought;
        if (softDrinksAvailable < 1){

            throw  new SoftDrinksOutOfStockException("Sorry no more "+productName+" left");
        }

        System.out.println("Available "+productName+": "+ softDrinksAvailable);

    }

    public void buy(Product product) throws InvalidProductException {


    }


}
