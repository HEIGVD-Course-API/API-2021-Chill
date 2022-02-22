package ch.heigvd.api.chill.domain.nigelmann;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.domain.nigelmann.Vodka;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VodkaTest {

    @Test
    void thePriceAndNameForVodkaShouldBeCorrect() {
        Vodka beer = new Vodka();
        assertEquals(beer.getName(), Vodka.NAME);
        assertEquals(beer.getPrice(), Vodka.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForVodka() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.api.chill.domain.nigelmann.Vodka";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Vodka.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
