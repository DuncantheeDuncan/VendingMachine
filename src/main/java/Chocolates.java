
public class Chocolates extends Product{

    // public static int totalStock = 0;
   static int chocolateAvalable=0;
    String productName = "Chocolates";

    public void addStock(Product product, int newStock){
        chocolateAvalable = chocolateAvalable + newStock;

        // stockCount++;

        System.out.println("Added new stock:");
        System.out.println(productName +" Added : " +"("+newStock +") Items");
        System.out.println("Total stock of "+productName+ ":"+ chocolateAvalable+"\n\n");

//        System.out.println("Stock available: "+ stockCount );


    }
    public void buy(int bought){
        chocolateAvalable -= bought;
        System.out.println("Available Soft Drinks: "+ chocolateAvalable);
    }


    public  int getStockProductAvailable(){

        
        return chocolateAvalable;
    }

    public  void numberOfProductInthevendingMachine(){
        totalStock +=chocolateAvalable;
        System.out.println(totalStock); 
        System.out.println(); 
    }
}
