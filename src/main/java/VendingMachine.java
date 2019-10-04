
public class VendingMachine  {

    static  int productStock= 0;

    public static  void buy(Product product,int itemsToBuy) throws  Exception {

        product.buy(itemsToBuy);


    }


    public static void main(String[] args) {

        Product softDrinks = new SoftDrinks();

        Product Dairywoman = new Chocolates();

        softDrinks.addStock(softDrinks,5);
        softDrinks.addStock(softDrinks,5);

        Dairywoman.addStock(Dairywoman,5);


        softDrinks.addStock(softDrinks,6);

        Dairywoman.addStock(Dairywoman,5);
        Dairywoman.addStock(Dairywoman,5);



//        VendingMachine.buy(softDrinks,2);
//        VendingMachine.buy(softDrinks,2);



        System.out.println("Stock available :"+productStock+ "\n");
//        ------------------------------------------
        System.out.println("Available stock of product type : "+new Product().getStockAvailable());

//        ------------------------------------------

    }
}



