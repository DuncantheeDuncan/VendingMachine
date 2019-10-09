package vendingmachine.Products;

import vendingmachine.Exceptions.NumberMustBeGreaterThanZero;
import vendingmachine.Exceptions.SoftDrinksOutOfStockException;
import vendingmachine.Products.Product;

public class SoftDrinks extends Product {
    
//    public static int totalStock = 0;
      int softDrinksAvailable=0;

    String productName = "Soft Drinks";

    public void addStock(Product product, int newStock)throws NumberMustBeGreaterThanZero {
        if (newStock > 0){
            softDrinksAvailable = softDrinksAvailable + newStock;
            System.out.println("Added new stock:");
            System.out.println(productName +" Added : " +"("+newStock +") Items");
            System.out.println("Total stock of "+productName+ ":"+ softDrinksAvailable+"\n\n");
        }else {
            throw new NumberMustBeGreaterThanZero("you can't add a Zero '0' or negative Stock");
        }

    }

    public void buy(int bought) throws SoftDrinksOutOfStockException {
        softDrinksAvailable -= bought;
        if (softDrinksAvailable < 1){

            throw  new SoftDrinksOutOfStockException("Sorry no more soft drinks left");
        }

        System.out.println("Available Soft Drinks: "+ softDrinksAvailable);
    }

    public  int getStockProductAvailable(){

        return softDrinksAvailable;
    }

    public  int numberOfProductInthevendingMachine(){
        Product.totalStock += softDrinksAvailable;
       System.out.println(Product.totalStock);
       System.out.println();
       return Product.totalStock;
    }
}
