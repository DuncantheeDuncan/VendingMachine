
import org.junit.jupiter.api.Test;
import vendingmachine.Exceptions.InvalidProductException;
import vendingmachine.Exceptions.NumberMustBeGreaterThanZero;
import vendingmachine.Exceptions.SoftDrinksOutOfStockException;
import vendingmachine.MaxiVendingMachine;
import vendingmachine.Products.SoftDrinks;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxiVendingMachineTestForSOftDrinkTest {
    MaxiVendingMachine mxv = new MaxiVendingMachine();

//Todo testing adding stock for products

    @Test
    void testingAddingStockForSoftDrinks() throws NumberMustBeGreaterThanZero, InvalidProductException {
        SoftDrinks softDrinks = new SoftDrinks();

        mxv.addStock(softDrinks);
        assertEquals(1, mxv.softDrinksAvailable());

        mxv.addStock(softDrinks);
        mxv.addStock(softDrinks);

        if (mxv.softDrinksAvailableAdd() <= 0) {
            System.out.println("Exception -> 'NumberMustBeGreaterThanZero' was thrown");
            assertThrows(NumberMustBeGreaterThanZero.class, () ->
                    mxv.addStock(softDrinks));
        }
    }

//TODO testing buy method for products

    //TODO Soft Drinks

    @Test
    void testingBuyForSoftDrinks() throws NumberMustBeGreaterThanZero, InvalidProductException, SoftDrinksOutOfStockException {
        SoftDrinks softDrinks = new SoftDrinks();

        mxv.addStock(softDrinks);
        mxv.addStock(softDrinks);
        mxv.addStock(softDrinks);

        mxv.buy(softDrinks);
        assertEquals(2, mxv.softDrinksAvailable());

        //TODO: testing exceptions
        mxv.buy(softDrinks);
        mxv.buy(softDrinks);

        if (mxv.softDrinksAvailable() == 0) {
            System.out.println("Exception -> 'SoftDrinksOutOfStockException' was thrown");
            assertThrows(SoftDrinksOutOfStockException.class, () ->
                    mxv.buy(softDrinks));
        }
    }

//TODO: testing stock level for products

    //Todo Stock level for Soft Drinks
    @Test
    void testingStockLevelForSoftDrinks() throws NumberMustBeGreaterThanZero, InvalidProductException {
        SoftDrinks softDrinks = new SoftDrinks();
        mxv.addStock(softDrinks);
        mxv.addStock(softDrinks);
        mxv.addStock(softDrinks);

        mxv.getStock(softDrinks);
        assertEquals(3, mxv.softDrinksAvailable());
    }
}
