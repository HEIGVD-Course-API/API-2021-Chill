package ch.heigvd.res.chill.domain.Webblitchy;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VanillaCokeTest {

    @Test
    void thePriceAndNameForVanillaCokeShouldBeCorrect() {
        VanillaCoke coke = new VanillaCoke();
        assertEquals(coke.getName(), VanillaCoke.NAME);
        assertEquals(coke.getPrice(), VanillaCoke.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForVanillaCoke() {
        int factor = 3;
        Bartender lucien = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Webblitchy.VanillaCoke";
        OrderRequest request = new OrderRequest(factor, productName);
        OrderResponse response = lucien.order(request);
        BigDecimal expectedTotalPrice = VanillaCoke.PRICE.multiply(new BigDecimal(factor));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}