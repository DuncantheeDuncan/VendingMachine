package vendingmachine;

import vendingmachine.Exceptions.*;
import vendingmachine.Products.Chocolates;
import vendingmachine.Products.Product;
import vendingmachine.Products.SaltySnacks;
import vendingmachine.Products.SoftDrinks;

public class VendingMachine {

    int softDrinksAvailable = 0;
    int chocolatesAvalable = 0;
    int saltySnackAvailable = 0;

    String softdrinks = "soft drinks";
    String chocolate = " Chocolates";
    String snacks = " Salty snacks";

    public void buy(Product product) throws ProductNotFoundException {
        if (product instanceof SoftDrinks) {
            if (softDrinksAvailable > 0) {
                softDrinksAvailable--;

            } else {
                throw new SoftDrinksOutOfStockException("Sorry no more " + softdrinks + " left");
            }

        } else if (product instanceof Chocolates) {
            if (chocolatesAvalable > 0) {
                chocolatesAvalable--;

            } else {
                throw new ChocolatesAllGoneException("Sorry no more " + chocolate + " left");
            }
        } else if (product instanceof SaltySnacks) {
            if (saltySnackAvailable > 0) {
                saltySnackAvailable--;

            } else {
                throw new SaltyCracksAllEatenException("Sorry no more " + snacks + " left");
            }
        } else {
            throw new InvalidProductException("We don't sell that here!!");
        }

    }


    public void addStock(Product product, int newStock) throws NumberMustBeGreaterThanZero, InvalidProductException {

        if (newStock > 0) {
            if (product instanceof SoftDrinks) {

                softDrinksAvailable = softDrinksAvailable + newStock;
                System.out.println("Added new stock:");
                System.out.println(softdrinks + " Added : " + "(" + newStock + ") Items");
                System.out.println("Total stock of " + softdrinks + ":" + softDrinksAvailable + "\n\n");

            } else if (product instanceof Chocolates) {
                chocolatesAvalable = chocolatesAvalable + newStock;
                System.out.println("Added new stock:");
                System.out.println(chocolate + " Added : " + "(" + newStock + ") Items");
                System.out.println("Total stock of " + chocolate + ":" + chocolatesAvalable + "\n\n");

            } else if (product instanceof SaltySnacks) {

                saltySnackAvailable = saltySnackAvailable + newStock;
                System.out.println("Added new stock:");
                System.out.println(snacks + " Added : " + "(" + newStock + ") Items");
                System.out.println("Total stock of " + snacks + ":" + saltySnackAvailable + "\n\n");
            } else {

                throw new InvalidProductException("Vending Machine can't take this kind of product");
            }

        } else {

            throw new NumberMustBeGreaterThanZero("you can't add a Zero '0' or negative Stock");
        }
    }


    public int getStock(Product product) throws ProductNotFoundException {
        if (product instanceof SoftDrinks) {
            System.out.print("Available " + softdrinks + ": ");
            return softDrinksAvailable;
        } else if (product instanceof Chocolates) {
            System.out.print("Available " + chocolate + ": ");
            return chocolatesAvalable;

        } else if (product instanceof SaltySnacks) {
            System.out.print("Available " + snacks + ": ");
            return saltySnackAvailable;

        } else {
            throw new ProductNotFoundException("we're not sure which product you're talking about");
        }

//    return 0;
    }
}



