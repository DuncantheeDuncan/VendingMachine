package vendingmachine;

import vendingmachine.Exceptions.*;
import vendingmachine.Products.Chocolates;
import vendingmachine.Products.Product;
import vendingmachine.Products.SaltySnacks;
import vendingmachine.Products.SoftDrinks;

public class Main {


    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        Product softDrinks = new SoftDrinks();
        Product chocolates = new Chocolates();
        Product saltySnacks = new SaltySnacks();

        try {
//TODO          Adding Stock
            vendingMachine.addStock(chocolates, 7);




//TODO       Buying Stock
            vendingMachine.buy(softDrinks);
            vendingMachine.buy(softDrinks);
            vendingMachine.buy(softDrinks);

//TODO       Get Stock Level
            System.out.println(vendingMachine.getStock(softDrinks));
            System.out.println(vendingMachine.getStock(saltySnacks));
            System.out.println(vendingMachine.getStock(chocolates));

        } catch (SoftDrinksOutOfStockException e) {
            System.out.println(e.getMessage());


        } catch (ChocolatesAllGoneException e) {
            System.out.println(e.getMessage());

        } catch (NumberMustBeGreaterThanZero e) {

            System.out.println(e.getMessage());

        } catch (InvalidProductException e) {
            System.out.println(e.getMessage());
        } catch (ProductNotFoundException e) {

            System.out.println(e.getMessage());
        }


    }


}
