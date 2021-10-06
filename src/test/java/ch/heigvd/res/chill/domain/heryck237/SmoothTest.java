package ch.heigvd.res.chill.domain.heryck237;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmoothTest {

    @Test
    void thePriceAndNameForSmoothShouldBeCorrect() {
        Smooth beer = new Smooth();
        assertEquals(beer.getName(), Smooth.NAME);
        assertEquals(beer.getPrice(), Smooth.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSmooth() {
        Bartender Erica = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.heryck237.Smooth";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = Erica.order(request);
        BigDecimal expectedTotalPrice = Smooth.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}