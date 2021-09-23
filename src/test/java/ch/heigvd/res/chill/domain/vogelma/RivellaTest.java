package ch.heigvd.res.chill.domain.vogelma;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RivellaTest {

  @Test
  void thePriceAndNameForRivellaShouldBeCorrect() {
    Rivella brew = new Rivella();
    assertEquals(brew.getName(), Rivella.NAME);
    assertEquals(brew.getPrice(), Rivella.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForRivella() {
    Bartender claudine = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.vogelma.Rivella";
    OrderRequest request = new OrderRequest(5, productName);
    OrderResponse response = claudine.order(request);
    BigDecimal expectedTotalPrice = Rivella.PRICE.multiply(new BigDecimal(5));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}