package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TonyIPATest {

  @Test
  void thePriceAndNameForTonyIPAShouldBeCorrect() {
    TonyIPA beer = new TonyIPA();
    assertEquals(beer.getName(), TonyIPA.NAME);
    assertEquals(beer.getPrice(), TonyIPA.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForTonyIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.wasadigi.TonyIPA";
    OrderRequest request = new OrderRequest(5, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = TonyIPA.PRICE.multiply(new BigDecimal(5));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}