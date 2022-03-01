package ch.heigvd.api.chill.domain.hugomendes98;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IceTeaPeachTest {

    @Test
    void thePriceAndNameIceTeaPeachShouldBeCorrect() {
        IceTeaPeach iceTea = new IceTeaPeach();
        assertEquals(iceTea.getName(), IceTeaPeach.NAME);
        assertEquals(iceTea.getPrice(), IceTeaPeach.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForIceTeaPeach() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.api.chill.domain.hugomendes98.IceTeaPeach";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = IceTeaPeach.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
