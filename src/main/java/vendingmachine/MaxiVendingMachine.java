package vendingmachine;

import vendingmachine.Exceptions.*;
import vendingmachine.Products.Chocolates;
import vendingmachine.Products.SaltySnacks;
import vendingmachine.Products.SoftDrinks;

public class MaxiVendingMachine extends VendingMachine {
//TODO: add stocks for products

    //    TODO Salty Snacks
    public void addStock(SaltySnacks saltySnacks) throws NumberMustBeGreaterThanZero, InvalidProductException {
        if (saltySnacks != null) {
            saltySnackAvailableAdd();
            if (saltySnackAvailable() < 1)
                throw new NumberMustBeGreaterThanZero("you can't add a zero stock");
        } else {
            throw new InvalidProductException("invalid product type");
        }
    }

    //    TODO SOft Drinks
    public void addStock(SoftDrinks softDrinks) throws NumberMustBeGreaterThanZero, InvalidProductException {
        if (softDrinks != null) {
            softDrinksAvailableAdd();
            if (softDrinksAvailable() < 1)
                throw new NumberMustBeGreaterThanZero("you can't add a zero stock");
        } else {
            throw new InvalidProductException("invalid product type");
        }
    }

    //    TODO Chocolates
    public void addStock(Chocolates chocolates) throws NumberMustBeGreaterThanZero, InvalidProductException {
        if (chocolates != null) {
            chocolatesAvailableAdd();
            if (chocolatesAvailable() < 1)
                throw new NumberMustBeGreaterThanZero("you can't add a zero stock");
        } else {
            throw new InvalidProductException("invalid product type");
        }
    }


//TODO: buying stocks
    //    TODO Salty Snacks

    public void buy(SaltySnacks saltySnacks) throws SaltyCracksAllEatenException {

        if (saltySnackAvailable() < 1)
            throw new SaltyCracksAllEatenException("no more snacks left");

        saltySnackAvailableBuy();
    }

    //    TODO Soft Drinks

    public void buy(SoftDrinks softDrinks) throws SoftDrinksOutOfStockException {

        if (softDrinksAvailable() < 1)
            throw new SoftDrinksOutOfStockException("No more SOft drinks left");

        softDrinksAvailableBuy();
    }

    //    TODO chocolate

    public void buy(Chocolates chocolates) throws ChocolatesAllGoneException {

        if (chocolatesAvailable() < 1)
            throw new ChocolatesAllGoneException("no more Chocolates left");

        chocolatesAvailableBuy();
    }


//TODO: getting stock level

    //    TODO Salty Snacks
    public void getStock(SaltySnacks saltySnacks) {
        System.out.println("Available salty snacks " + saltySnackAvailable());
    }

    //    TODO Soft Drinks
    public void getStock(SoftDrinks softDrinks) {
        System.out.println("Available Soft Drinks " + softDrinksAvailable());
    }

    //    TODO chocolate
    public void getStock(Chocolates chocolates) {
        System.out.println("Available Chocolates " + chocolatesAvailable());
    }

}
