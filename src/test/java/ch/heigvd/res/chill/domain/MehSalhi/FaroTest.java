package ch.heigvd.res.chill.domain.MehSalhi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FaroTest {

  @Test
  void thePriceAndNameForFaroShouldBeCorrect() {
    Faro beer = new Faro();
    assertEquals(beer.getName(), Faro.NAME);
    assertEquals(beer.getPrice(), Faro.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForFaro() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MehSalhi.Faro";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Faro.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}