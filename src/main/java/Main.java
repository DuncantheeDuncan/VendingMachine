public class Main extends VendingMachine{


    public static void main(String[] args) {



            Product softDrinks = new SoftDrinks();
            Product DairyChocolate = new Chocolates();

            try {
                // adding stock
                softDrinks.addStock(softDrinks,21);
                DairyChocolate.addStock(DairyChocolate, 22);

                //  buying product
                VendingMachine.buy(softDrinks,20);
//                VendingMachine.buy(null,1);// gets INvalidException
                VendingMachine.buy(DairyChocolate,21);


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
