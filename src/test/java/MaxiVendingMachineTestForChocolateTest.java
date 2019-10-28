import org.junit.jupiter.api.Test;
import vendingmachine.Exceptions.ChocolatesAllGoneException;
import vendingmachine.Exceptions.InvalidProductException;
import vendingmachine.Exceptions.NumberMustBeGreaterThanZero;
import vendingmachine.MaxiVendingMachine;
import vendingmachine.Products.Chocolates;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxiVendingMachineTestForChocolateTest {

    MaxiVendingMachine mxv = new MaxiVendingMachine();

//Todo testing adding stock for products

    @Test
    void testingAddingStockForChocolate() throws NumberMustBeGreaterThanZero, InvalidProductException {
        Chocolates chocolates = new Chocolates();

        mxv.addStock(chocolates);
        assertEquals(1, mxv.chocolatesAvailable());

        mxv.addStock(chocolates);
        mxv.addStock(chocolates);

        if (mxv.chocolatesAvailableAdd() <= 0) {
            System.out.println("Exception -> 'NumberMustBeGreaterThanZero' was thrown");
            assertThrows(NumberMustBeGreaterThanZero.class, () ->
                    mxv.addStock(chocolates));
        }
    }

//TODO testing buy method for products

    //TODO Chocolates

    @Test
    void testingBuyForChocolate() throws NumberMustBeGreaterThanZero, ChocolatesAllGoneException, InvalidProductException {
        Chocolates chocolates = new Chocolates();

        mxv.addStock(chocolates);
        mxv.addStock(chocolates);
        mxv.addStock(chocolates);
        mxv.addStock(chocolates);

        mxv.buy(chocolates);

        assertEquals(3, mxv.chocolatesAvailable());

        //TODO: testing exceptions
        mxv.buy(chocolates);
        mxv.buy(chocolates);
        mxv.buy(chocolates);

        if (mxv.chocolatesAvailable() == 0) {
            System.out.println("Exception -> 'ChocolatesAllGoneException' was thrown");
            assertThrows(ChocolatesAllGoneException.class, () ->
                    mxv.buy(chocolates));
        }
    }

//TODO: testing stock level for products

    //Todo Stock level for Chocolates
    @Test
    void testingStockLevelForChocolate() throws NumberMustBeGreaterThanZero, InvalidProductException {
        Chocolates chocolates = new Chocolates();

        mxv.addStock(chocolates);
        mxv.addStock(chocolates);
        mxv.addStock(chocolates);

        mxv.getStock(chocolates);

        assertEquals(3, mxv.chocolatesAvailable());

    }
}
