package ch.heigvd.res.chill.domain.Webblitchy;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BFMTest {

    @Test
    void thePriceAndNameForBFMShouldBeCorrect() {
        BFM beer = new BFM();
        assertEquals(beer.getName(), BFM.NAME);
        assertEquals(beer.getPrice(), BFM.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBFM() {
        Bartender yohann = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Webblitchy.BFM";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = yohann.order(request);
        BigDecimal expectedTotalPrice = BFM.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}