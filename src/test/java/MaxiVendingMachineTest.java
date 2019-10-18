import org.junit.jupiter.api.Test;
import vendingmachine.Exceptions.InvalidProductException;
import vendingmachine.Exceptions.NumberMustBeGreaterThanZero;
import vendingmachine.Exceptions.SaltyCracksAllEatenException;
import vendingmachine.MaxiVendingMachine;
import vendingmachine.Products.SaltySnacks;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxiVendingMachineTest {
MaxiVendingMachine mxv = new MaxiVendingMachine();

//Todo testing adding stock for products

@Test
void testingAddingStockForSaltySnacks() throws NumberMustBeGreaterThanZero, InvalidProductException {
    SaltySnacks saltySnacks = new SaltySnacks();

    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);

    assertEquals(4,mxv.saltySnackAvailable());
}


//TODO testing buy method for products

@Test
    void testingBuyForSaltySnacks() throws NumberMustBeGreaterThanZero, SaltyCracksAllEatenException, InvalidProductException {
    SaltySnacks saltySnacks = new SaltySnacks();


    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);

    mxv.buy(saltySnacks);

    assertEquals(2,mxv.saltySnackAvailable());

}

//TODO: testing stock level for products

    //Todo
@Test
    void testingStockLevelForSaltySnacks() throws NumberMustBeGreaterThanZero, InvalidProductException {
    SaltySnacks saltySnacks = new SaltySnacks();

    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);


    mxv.getStock(saltySnacks);

    assertEquals(7,mxv.saltySnackAvailable());
}


}
