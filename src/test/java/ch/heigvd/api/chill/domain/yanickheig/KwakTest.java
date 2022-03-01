package ch.heigvd.api.chill.domain.yanickheig;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.domain.yanickheig.Kwak;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KwakTest {

    @Test
    void thePriceAndNameForKwakShouldBeCorrect() {
        Kwak beer = new Kwak();
        assertEquals(beer.getName(), Kwak.NAME);
        assertEquals(beer.getPrice(), Kwak.PRICE);
    }
    @Test
    void aBartenderShouldAcceptAnOrderForKwak() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.api.chill.domain.yanickheig.Kwak";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Kwak.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}

