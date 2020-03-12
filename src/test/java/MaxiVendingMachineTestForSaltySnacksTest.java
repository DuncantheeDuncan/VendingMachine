import org.junit.jupiter.api.Test;
import vendingmachine.Exceptions.InvalidProductException;
import vendingmachine.Exceptions.NumberMustBeGreaterThanZero;
import vendingmachine.Exceptions.SaltyCracksAllEatenException;
import vendingmachine.MaxiVendingMachine;
import vendingmachine.Products.SaltySnacks;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxiVendingMachineTestForSaltySnacksTest {
    MaxiVendingMachine mxv = new MaxiVendingMachine();

//Todo testing adding stock for products

    @Test
    void testingAddingStockForSaltySnacks() throws NumberMustBeGreaterThanZero, InvalidProductException, SaltyCracksAllEatenException {
        SaltySnacks saltySnacks = new SaltySnacks();

        mxv.addStock(saltySnacks);
        mxv.addStock(saltySnacks);
        mxv.addStock(saltySnacks);
        mxv.buy(saltySnacks);

        assertEquals(2, mxv.saltySnackAvailable());

        mxv.addStock(saltySnacks);
        mxv.addStock(saltySnacks);

        if (mxv.saltySnackAvailableAdd() <= 0) {
            System.out.println("Exception -> 'NumberMustBeGreaterThanZero' was thrown");
            assertThrows(NumberMustBeGreaterThanZero.class, () ->
                    mxv.addStock(saltySnacks));
        }
    }

//TODO testing buy method for products

    //TODO Salty Snacks

    @Test
    void testingBuyForSaltySnacks() throws NumberMustBeGreaterThanZero, SaltyCracksAllEatenException, InvalidProductException {
        SaltySnacks saltySnacks = new SaltySnacks();

        mxv.addStock(saltySnacks);
        mxv.addStock(saltySnacks);
        mxv.addStock(saltySnacks);

        mxv.buy(saltySnacks);

        assertEquals(2, mxv.saltySnackAvailable());

        //TODO: testing exceptions
        mxv.buy(saltySnacks);
        mxv.buy(saltySnacks);

        if (mxv.saltySnackAvailable() == 0) {
            System.out.println("Exception -> 'SaltyCracksAllEatenException' was thrown");
            assertThrows(SaltyCracksAllEatenException.class, () ->
                    mxv.buy(saltySnacks));
        }
    }

//TODO: testing stock level for products

    //Todo Stock level for salty snack
    @Test
    void testingStockLevelForSaltySnacks() throws NumberMustBeGreaterThanZero, InvalidProductException {
        SaltySnacks saltySnacks = new SaltySnacks();

        mxv.addStock(saltySnacks);
        mxv.addStock(saltySnacks);
        mxv.addStock(saltySnacks);

        mxv.getStock(saltySnacks);

        assertEquals(3, mxv.saltySnackAvailable());
    }
}
