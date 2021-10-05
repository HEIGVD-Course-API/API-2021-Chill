package ch.heigvd.res.chill.domain.damienmaier;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FortyTwoTest {

    @Test
    void aBartenderShouldAcceptAnOrderForFortyTwo() {
        Bartender bob = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.damienmaier.FortyTwo";
        OrderRequest request = new OrderRequest(10, productName);
        OrderResponse response = bob.order(request);
        BigDecimal expectedTotalPrice = FortyTwo.PRICE.multiply(new BigDecimal(10));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}