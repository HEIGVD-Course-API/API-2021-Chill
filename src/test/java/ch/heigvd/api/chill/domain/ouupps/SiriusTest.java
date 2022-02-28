package ch.heigvd.api.chill.domain.ouupps;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SiriusTest {

  @Test
  void thePriceAndNameForPunkIPASiriusShouldBeCorrect() {
    Sirius beer = new Sirius();
    assertEquals(beer.getName(), Sirius.NAME);
    assertEquals(beer.getPrice(), Sirius.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSirius() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.ouupps.Sirius";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Sirius.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
