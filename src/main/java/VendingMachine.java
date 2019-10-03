
public class VendingMachine {

    static  int productStock= 0;

    public static  void buy(Product p,int itemsToBuy){

        int stock = p.getStockProductAvailable();

        productStock = stock;

        productStock -= itemsToBuy;

//        System.out.println("Stock available: " + productStock );


    }


    public static void main(String[] args) {

        Product softDrinks = new SoftDrinks();
        Product Dairychocolate = new Chocolates();

        softDrinks.addStock(softDrinks,4);
        softDrinks.addStock(softDrinks,6);
        softDrinks.addStock(softDrinks,6);

        Dairychocolate.addStock(Dairychocolate,5);
        Dairychocolate.addStock(Dairychocolate,5);



        VendingMachine.buy(softDrinks,10);

//TODO: prevent it from changing the variable after making new instance of a class.
//        VendingMachine.buy(Dairychocolate,5);


        System.out.println("Stock available :"+productStock+ "\n");
//        ------------------------------------------
        System.out.println("Available stock of product type : "+new Product().getStockAvailable());

//        ------------------------------------------

    }
}



