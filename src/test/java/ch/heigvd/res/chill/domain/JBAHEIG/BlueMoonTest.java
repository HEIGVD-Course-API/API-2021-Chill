package ch.heigvd.res.chill.domain.JBAHEIG;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.jorisSchaller.Kekette;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BlueMoonTest {
    @Test
    void thePriceAndNameForBlueMoonShouldBeCorrect() {
        BlueMoon beer = new BlueMoon();
        assertEquals(beer.getName(), BlueMoon.NAME);
        assertEquals(beer.getPrice(), BlueMoon.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBlueMoon() {
        Bartender janeWhereIsMyBeer = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.JBAHEIG.BlueMoon";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = janeWhereIsMyBeer.order(request);
        BigDecimal expectedTotalPrice = BlueMoon.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}