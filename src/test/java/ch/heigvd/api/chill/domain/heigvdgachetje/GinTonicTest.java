package ch.heigvd.api.chill.domain.heigvdgachetje;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GinTonicTest {

  @Test
  void thePriceAndNameForLongIslandIcedTeaShouldBeCorrect() {
    GinTonic drink = new GinTonic();
    assertEquals(drink.getName(), GinTonic.NAME);
    assertEquals(drink.getPrice(), GinTonic.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLongIslandIcedTea() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.heigvdgachetje.GinTonic";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = GinTonic.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
