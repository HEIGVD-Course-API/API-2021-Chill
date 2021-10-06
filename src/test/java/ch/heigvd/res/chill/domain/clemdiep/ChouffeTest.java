package ch.heigvd.res.chill.domain.clemdiep;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.clemdiep.Chouffe;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChouffeTest {
    @Test
    void thePriceAndNameForChouffeShouldBeCorrect() {
        Chouffe beer = new Chouffe();
        assertEquals(beer.getName(), Chouffe.NAME);
        assertEquals(beer.getPrice(), Chouffe.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForChouffe() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.clemdiep.Chouffe";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Chouffe.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
