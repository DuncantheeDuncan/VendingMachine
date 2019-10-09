package vendingmachine.Products;

import vendingmachine.Exceptions.ChocolatesAllGoneException;

public class Chocolates extends Product {

    // public static int totalStock = 0;
   static int chocolateAvalable=0;
    String productName = "vendingmachine.Products.Chocolates";

    public void addStock(Product product, int newStock){
        chocolateAvalable = chocolateAvalable + newStock;

        // stockCount++;

        System.out.println("Added new stock:");
        System.out.println(productName +" Added : " +"("+newStock +") Items");
        System.out.println("Total stock of "+productName+ ":"+ chocolateAvalable+"\n\n");

//        System.out.println("Stock available: "+ stockCount );


    }
    public void buy(int bought)throws ChocolatesAllGoneException {
        chocolateAvalable -= bought;
        if (chocolateAvalable <  0){
            throw new ChocolatesAllGoneException("Sorry today is not the day, out of stock");
        }
        System.out.println("Available "+productName+": "+ chocolateAvalable);
    }


    public  int getStockProductAvailable(){

        
        return chocolateAvalable;
    }

    public  int numberOfProductInthevendingMachine(){
        Product.totalStock +=chocolateAvalable;
        System.out.println(Product.totalStock);
        System.out.println();
        return Product.totalStock;
    }
}
