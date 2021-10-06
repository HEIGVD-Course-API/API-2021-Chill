package ch.heigvd.res.chill.domain.heryck237;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OriginTest {

    @Test
    void thePriceAndNameForOriginShouldBeCorrect() {
        Origin beer = new Origin();
        assertEquals(beer.getName(), Origin.NAME);
        assertEquals(beer.getPrice(), Origin.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForOrigin() {
        Bartender Erica = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.heryck237.Origin";
        OrderRequest request = new OrderRequest(4, productName);
        OrderResponse response = Erica.order(request);
        BigDecimal expectedTotalPrice = Origin.PRICE.multiply(new BigDecimal(4));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}