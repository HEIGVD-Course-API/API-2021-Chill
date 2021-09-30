package ch.heigvd.res.chill.domain.MaximGY;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class IceTeaTest {

    @Test
    void thePriceAndNameForIceTeaShouldBeCorrect() {

        IceTea drink = new IceTea();

        assertEquals(IceTea.PRICE, drink.getPrice());
        assertEquals(IceTea.NAME, drink.getName());
    }

    @Test
    void aBartenderShouldAcceptAnOrdeForIceTea() {

        int quantity = 6;
        Bartender michele = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.MaximGY.IceTea";

        OrderRequest request = new OrderRequest(quantity, productName);
        OrderResponse response = michele.order(request);

        BigDecimal expectedTotalPrice = IceTea.PRICE.multiply(new BigDecimal(quantity));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}