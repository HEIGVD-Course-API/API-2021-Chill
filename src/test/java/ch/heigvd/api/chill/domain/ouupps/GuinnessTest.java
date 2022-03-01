package ch.heigvd.api.chill.domain.ouupps;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuinnessTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Guinness beer = new Guinness();
    assertEquals(beer.getName(), Guinness.NAME);
    assertEquals(beer.getPrice(), Guinness.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.ouupps.Guinness";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Guinness.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
