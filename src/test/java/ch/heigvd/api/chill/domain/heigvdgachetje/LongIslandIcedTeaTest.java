package ch.heigvd.api.chill.domain.heigvdgachetje;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongIslandIcedTeaTest {

  @Test
  void thePriceAndNameForLongIslandIcedTeaShouldBeCorrect() {
    LongIslandIcedTea drink = new LongIslandIcedTea();
    assertEquals(drink.getName(), LongIslandIcedTea.NAME);
    assertEquals(drink.getPrice(), LongIslandIcedTea.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLongIslandIcedTea() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.heigvdgachetje.LongIslandIcedTea";
    OrderRequest request = new OrderRequest(2, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = LongIslandIcedTea.PRICE.multiply(new BigDecimal(2));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
