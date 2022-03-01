package ch.heigvd.api.chill.domain.noahboegli;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RhumTest {

  @Test
  void thePriceAndNameForRhumShouldBeCorrect() {
    Rhum rhum = new Rhum();
    assertEquals(rhum.getName(), Rhum.NAME);
    assertEquals(rhum.getPrice(), Rhum.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForRhum() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.noahboegli.Rhum";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Rhum.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
