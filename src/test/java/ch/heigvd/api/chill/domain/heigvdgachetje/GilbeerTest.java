package ch.heigvd.api.chill.domain.heigvdgachetje;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GilbeerTest {

  @Test
  void thePriceAndNameForLongIslandIcedTeaShouldBeCorrect() {
    Gilbeer drink = new Gilbeer();
    assertEquals(drink.getName(), Gilbeer.NAME);
    assertEquals(drink.getPrice(), Gilbeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLongIslandIcedTea() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.heigvdgachetje.Gilbeer";
    OrderRequest request = new OrderRequest(5, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Gilbeer.PRICE.multiply(new BigDecimal(5));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
