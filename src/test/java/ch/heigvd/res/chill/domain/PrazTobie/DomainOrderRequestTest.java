package ch.heigvd.res.chill.domain.PrazTobie;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DomainOrderRequestTest {
    @Test
    void aBartenderShouldAcceptADomainOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "wasadigi.Boxer";
        DomainOrderRequest request = new DomainOrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Boxer.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}