public class SoftDrinks extends Product {
    
//    public static int totalStock = 0;
      int softDrinksAvailabe=0;

    String productName = "Soft Drinks";

    public void addStock(Product product, int newStock){
        softDrinksAvailabe = softDrinksAvailabe + newStock;

        // stockCount++;

        System.out.println("Added new stock:");
        System.out.println(productName +" Added : " +"("+newStock +") Items");
        System.out.println("Total stock of "+productName+ ":"+ softDrinksAvailabe+"\n\n");

        // System.out.println("Stock available: "+ stockCount );



    }

    public void buy(int bought){
        softDrinksAvailabe -= bought;
        System.out.println("Available Soft Drinks: "+ softDrinksAvailabe);
    }

    public  int getStockProductAvailable(){

        return softDrinksAvailabe;
    }

    public  void numberOfProductInthevendingMachine(){
        totalStock += softDrinksAvailabe;
        

       System.out.println(totalStock); 
       System.out.println();
    }
}
