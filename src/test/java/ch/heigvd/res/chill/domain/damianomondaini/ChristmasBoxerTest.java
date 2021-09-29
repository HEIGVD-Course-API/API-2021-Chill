package ch.heigvd.res.chill.domain.damianomondaini;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChristmasBoxerTest {

    @Test
    void thePriceAndNameForChristmasBoxerShouldBeCorrect() {
        ChristmasBoxer beer = new ChristmasBoxer();
        assertEquals(beer.getName(), ChristmasBoxer.NAME);
        assertEquals(beer.getPrice(), ChristmasBoxer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForChristmasBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.damianomondaini.ChristmasBoxer";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = ChristmasBoxer.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}