

public class VendingMachine  {


    public static  void buy(Product product,int itemsToBuy) throws ProductNotFoundException ,InvalidProductException {

        if (product instanceof  Product){
            product.buy(itemsToBuy);
        }else {
            throw new InvalidProductException("We don't sell that here!!");
        }
        
        System.out.print("Total stock in vending machine: ");

        if(product.numberOfProductInthevendingMachine() < 1){

            throw new ProductNotFoundException("Oops We don't have any stock try again later!");

        }

    }
}



