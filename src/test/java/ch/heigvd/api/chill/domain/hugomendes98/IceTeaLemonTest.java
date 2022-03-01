package ch.heigvd.api.chill.domain.hugomendes98;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IceTeaLemonTest {

    @Test
    void thePriceAndNameForIceTeaLemonShouldBeCorrect() {
        IceTeaLemon ice = new IceTeaLemon();
        assertEquals(ice.getName(), IceTeaLemon.NAME);
        assertEquals(ice.getPrice(), IceTeaLemon.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForIceTeaLemon() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.api.chill.domain.hugomendes98.IceTeaLemon";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = IceTeaLemon.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
