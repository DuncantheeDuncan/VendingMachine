
import org.junit.jupiter.api.Test;
import vendingmachine.Exceptions.InvalidProductException;
import vendingmachine.Exceptions.NumberMustBeGreaterThanZero;
import vendingmachine.MaxiVendingMachine;
import vendingmachine.Products.SaltySnacks;
import vendingmachine.VendingMachine;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MaxiVendingMachineTest {
    MaxiVendingMachine mxv = new MaxiVendingMachine();

     @Test
    public void addingStockForSaltySnacks()  {
         SaltySnacks saltySnacks = new SaltySnacks();
         try {
             mxv.addStock(saltySnacks,5);
             assertEquals(5,mxv.saltySnackAvailable());

         }
         catch(NumberMustBeGreaterThanZero e){

             e.getMessage();
         }catch (InvalidProductException e){

             e.getMessage();
         }





//    assertEquals(7,mxv.saltySnackAvailable());


    }




}
