package ch.heigvd.api.chill.domain.Kitsunemma;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CiderTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Cider beer = new Cider();
    assertEquals(beer.getName(), Cider.NAME);
    assertEquals(beer.getPrice(), Cider.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.Kitsunemma.Cider";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Cider.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
