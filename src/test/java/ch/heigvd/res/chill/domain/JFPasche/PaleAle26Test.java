package ch.heigvd.res.chill.domain.JFPasche;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.jorisSchaller.Kekette;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PaleAle26Test {
    @Test
    void thePriceAndNameForPaleAle26ShouldBeCorrect() {
        PaleAle26 beer = new PaleAle26();
        assertEquals(beer.getName(), PaleAle26.NAME);
        assertEquals(beer.getPrice(), PaleAle26.PRICE);
    }
    @Test
    void aBartenderShouldAcceptAnOrderForPaleAle26() {
        int quantity = 4;
        Bartender jeff = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.JFPasche.PaleAle26";
        OrderRequest request = new OrderRequest(quantity, productName);
        OrderResponse response = jeff.order(request);
        BigDecimal expectedTotalPrice = PaleAle26.PRICE.multiply(new BigDecimal(quantity));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}