package ch.heigvd.api.chill.domain.dgheig;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PepsiColaTest {

    @Test
    void thePriceAndNameFoFruitJuiceShouldBeCorrect() {
        PepsiCola cola = new PepsiCola();
        assertEquals(cola.getName(), PepsiCola.NAME);
        assertEquals(cola.getPrice(), PepsiCola.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFruitJuice() {
        Bartender tom = new Bartender();
        String productName = "ch.heigvd.api.chill.domain.dgheig.PepsiCola";
        OrderRequest request = new OrderRequest(7, productName);
        OrderResponse response = tom.order(request);
        BigDecimal expectedTotalPrice = PepsiCola.PRICE.multiply(new BigDecimal(7));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
