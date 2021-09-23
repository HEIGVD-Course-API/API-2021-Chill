package ch.heigvd.res.chill.domain.BenVal555;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TellTest {

  @Test
  void thePriceAndNameForTellShouldBeCorrect() {
    Tell beer = new Tell();
    assertEquals(beer.getName(), Tell.NAME);
    assertEquals(beer.getPrice(), Tell.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForTell() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.BenVal555.Tell";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Tell.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
