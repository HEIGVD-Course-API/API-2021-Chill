package ch.heigvd.api.chill.domain.Kistunemma;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.domain.Kitsunemma.PiouShaker;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PiouShakerTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    PiouShaker beer = new PiouShaker();
    assertEquals(beer.getName(), PiouShaker.NAME);
    assertEquals(beer.getPrice(), PiouShaker.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.Kitsunemma.PiouShaker";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = PiouShaker.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
