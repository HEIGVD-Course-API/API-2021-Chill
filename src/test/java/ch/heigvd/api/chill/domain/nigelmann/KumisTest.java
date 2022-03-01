package ch.heigvd.api.chill.domain.nigelmann;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.domain.nigelmann.Kumis;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KumisTest {

  @Test
  void thePriceAndNameForKumisShouldBeCorrect() {
    Kumis beer = new Kumis();
    assertEquals(beer.getName(), Kumis.NAME);
    assertEquals(beer.getPrice(), Kumis.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForKumis() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.nigelmann.Kumis";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Kumis.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
