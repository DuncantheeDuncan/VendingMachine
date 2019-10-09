package vendingmachine.Products;

import vendingmachine.Exceptions.NumberMustBeGreaterThanZero;
import vendingmachine.Exceptions.ProductNotFoundException;

public class Product {

    public  int stockCount = 0;
    public static int totalStock = 0;

public void addStock(Product product, int newStock)throws NumberMustBeGreaterThanZero { }

public int getStockAvailable(){ return stockCount;}

public  int getStockProductAvailable() { return 0;}// not sure if this methods is doing what was 
// asked of it..

public void buy(int number) throws ProductNotFoundException {}
public   int numberOfProductInthevendingMachine(){ return 0;}

}
