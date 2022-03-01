package ch.heigvd.api.chill.domain.hugomendes98;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IceTeaOolongTest {

    @Test
    void thePriceAndNameForIceTeaOolongShouldBeCorrect() {
        IceTeaOolong beer = new IceTeaOolong();
        assertEquals(beer.getName(), IceTeaOolong.NAME);
        assertEquals(beer.getPrice(), IceTeaOolong.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForIceTeaOolong() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.api.chill.domain.hugomendes98.IceTeaOolong";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = IceTeaOolong.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
