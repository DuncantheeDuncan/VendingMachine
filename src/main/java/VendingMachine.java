

public class VendingMachine  {


    public static  void buy(Product product,int itemsToBuy) throws ProductNotFoundException ,InvalidProductException {

        if (product instanceof  Product){
            product.buy(itemsToBuy);
        }else {
            throw new InvalidProductException("We don't sell that here!!");
        }
        
        System.out.print("Total stock in vending machine: ");

        if(product.numberOfProductInthevendingMachine() == 0){

            throw new ProductNotFoundException("Oops We don't have any stock try again later!");

        }

    }



    public static void main(String[] args)  {

        Product softDrinks = new SoftDrinks();
        Product DairyChocolate = new Chocolates();
        OtherClass otherClass = new OtherClass();
        try {
            // adding stock
            softDrinks.addStock(softDrinks,21);
            DairyChocolate.addStock(DairyChocolate, 22);

            //  buying product
            VendingMachine.buy(softDrinks,20);
            VendingMachine.buy(null,20);
            VendingMachine.buy(DairyChocolate,20);


        } catch (SoftDrinksOutOfStockException e){
            System.out.println(e.getMessage());


        }catch (ChocolatesAllGoneException e){
            System.out.println(e.getMessage());

        }catch (NumberMustBeGreaterThanZero e){

            System.out.println(e.getMessage());

        }catch (InvalidProductException e){
            System.out.println(e.getMessage());
        }catch (ProductNotFoundException e){

            System.out.println(e.getMessage());
        }


    }
}



