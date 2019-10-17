import org.junit.jupiter.api.Test;
import vendingmachine.Exceptions.InvalidProductException;
import vendingmachine.Exceptions.NumberMustBeGreaterThanZero;
import vendingmachine.Exceptions.SaltyCracksAllEatenException;
import vendingmachine.MaxiVendingMachine;
import vendingmachine.Products.SaltySnacks;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxiVendingMachineTest {
MaxiVendingMachine mxv = new MaxiVendingMachine();

@Test
void addStock() throws  NumberMustBeGreaterThanZero {
    SaltySnacks saltySnacks = new SaltySnacks();

    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);

    assertEquals(4,mxv.saltySnackAvailable());
}

@Test
    void buy() throws NumberMustBeGreaterThanZero, SaltyCracksAllEatenException {
    SaltySnacks saltySnacks = new SaltySnacks();


    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);
    mxv.addStock(saltySnacks);

    mxv.buy(saltySnacks);

    assertEquals(2,mxv.saltySnackAvailable());

}

@Test
    void getStock() throws NumberMustBeGreaterThanZero {
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
