package ch.heigvd.api.chill.domain.dgheig;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FruitJuiceTest {

    @Test
    void thePriceAndNameFoFruitJuiceShouldBeCorrect() {
        FruitJuice juice = new FruitJuice();
        assertEquals(juice.getName(), FruitJuice.NAME);
        assertEquals(juice.getPrice(), FruitJuice.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFruitJuice() {
        Bartender alice = new Bartender();
        String productName = "ch.heigvd.api.chill.domain.dgheig.FruitJuice";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = alice.order(request);
        BigDecimal expectedTotalPrice = FruitJuice.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
