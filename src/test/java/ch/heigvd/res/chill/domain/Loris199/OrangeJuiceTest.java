package ch.heigvd.res.chill.domain.Loris199;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrangeJuiceTest {

  @Test
  void thePriceAndNameForOrangeJuiceShouldBeCorrect() {
    OrangeJuice beer = new OrangeJuice();
    assertEquals(beer.getName(), OrangeJuice.NAME);
    assertEquals(beer.getPrice(), OrangeJuice.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Loris199.OrangeJuice";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = OrangeJuice.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}