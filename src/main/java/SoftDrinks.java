public class SoftDrinks extends Product {

     static int softDrinksAvailabe=0;

    String productName = "Soft Drinks";

    public void addStock(Product product, int newStock){
        softDrinksAvailabe = softDrinksAvailabe + newStock;

        stockCount++;

        System.out.println("Added new stock:");
        System.out.println(productName +" Added : " +"("+newStock +") Items");
        System.out.println("Total stock of "+productName+ ":"+ softDrinksAvailabe+"\n\n");

        System.out.println("Stock available: "+ stockCount );


    }
    public  int getStockProductAvailable(){

        return softDrinksAvailabe;
    }
}
