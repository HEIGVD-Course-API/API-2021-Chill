package ch.heigvd.res.chill.domain.NelsonJnrnd;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MojitoTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Mojito beer = new Mojito();
    assertEquals(beer.getName(), Mojito.NAME);
    assertEquals(beer.getPrice(), Mojito.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.NelsonJnrnd.Mojito";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Mojito.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}