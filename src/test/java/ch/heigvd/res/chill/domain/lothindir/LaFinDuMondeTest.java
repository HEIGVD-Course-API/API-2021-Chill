package ch.heigvd.res.chill.domain.lothindir;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaFinDuMondeTest {

    @Test
    void thePriceAndNameForLaFinDuMondeShouldBeCorrect() {
        LaFinDuMonde beer = new LaFinDuMonde();
        assertEquals(beer.getName(), LaFinDuMonde.NAME);
        assertEquals(beer.getPrice(), LaFinDuMonde.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLaFinDuMonde() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.lothindir.LaFinDuMonde";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = LaFinDuMonde.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}