package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BiberonTest {

  @Test
  void thePriceAndNameForBiberonShouldBeCorrect() {
    Boxer beer = new Boxer();
    assertEquals(beer.getName(), Boxer.NAME);
    assertEquals(beer.getPrice(), Boxer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBiberon() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.wasadigi.Biberon";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Biberon.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}