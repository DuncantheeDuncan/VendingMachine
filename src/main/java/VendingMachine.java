
public class VendingMachine  {


    public static  void buy(Product product,int itemsToBuy)  {
        product.buy(itemsToBuy);
        
        System.out.print("Total stock in vending machine: ");
        product.numberOfProductInthevendingMachine();
    }


    public static void main(String[] args)    {

        Product softDrinks = new SoftDrinks();
        Product DairyChocolate = new Chocolates();
        
            // adding stock
        softDrinks.addStock(softDrinks,20);
        // softDrinks.addStock(softDrinks,20);
        DairyChocolate.addStock(DairyChocolate, 20);
           //  buying product
        VendingMachine.buy(softDrinks,10);
        VendingMachine.buy(DairyChocolate,10);


        
        


    }
}



