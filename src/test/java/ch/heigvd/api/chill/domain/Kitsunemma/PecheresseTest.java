package ch.heigvd.api.chill.domain.Kitsunemma;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PecheresseTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Pecheresse beer = new Pecheresse();
    assertEquals(beer.getName(), Pecheresse.NAME);
    assertEquals(beer.getPrice(), Pecheresse.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.Kitsunemma.Pecheresse";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Pecheresse.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
