
public class Chocolates extends Product{

   static int chocolateAvalable=0;
    String productName = "Chocolates";

    public void addStock(Product product, int newStock){
        chocolateAvalable = chocolateAvalable + newStock;

        stockCount++;

        System.out.println("Added new stock:");
        System.out.println(productName +" Added : " +"("+newStock +") Items");
        System.out.println("Total stock of "+productName+ ":"+ chocolateAvalable+"\n\n");

//        System.out.println("Stock available: "+ stockCount );


    }


    public  int getStockProductAvailable(){

        return chocolateAvalable;
    }
}
