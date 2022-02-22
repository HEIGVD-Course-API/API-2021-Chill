package ch.heigvd.api.chill.domain.dgheig;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotChocolateTest {

    @Test
    void thePriceAndNameFoFruitJuiceShouldBeCorrect() {
        HotChocolate chocolate = new HotChocolate();
        assertEquals(chocolate.getName(), HotChocolate.NAME);
        assertEquals(chocolate.getPrice(), HotChocolate.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFruitJuice() {
        Bartender bob = new Bartender();
        String productName = "ch.heigvd.api.chill.domain.dgheig.HotChocolate";
        OrderRequest request = new OrderRequest(1, productName);
        OrderResponse response = bob.order(request);
        BigDecimal expectedTotalPrice = HotChocolate.PRICE.multiply(new BigDecimal(1));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
