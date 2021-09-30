package ch.heigvd.res.chill.domain.heryck237;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.heryck237.Castel;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastelTest {

    @Test
    void thePriceAndNameForCastelShouldBeCorrect() {
        Castel beer = new Castel();
        assertEquals(beer.getName(), Castel.NAME);
        assertEquals(beer.getPrice(), Castel.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCastel() {
        Bartender Erica = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.heryck237.Castel";
        OrderRequest request = new OrderRequest(6, productName);
        OrderResponse response = Erica.order(request);
        BigDecimal expectedTotalPrice = Castel.PRICE.multiply(new BigDecimal(6));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
