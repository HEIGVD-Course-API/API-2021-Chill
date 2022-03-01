package ch.heigvd.api.chill.domain.noahboegli;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.domain.noahboegli.RedBull;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RedBullTest {

  @Test
  void thePriceAndNameForRedBullShouldBeCorrect() {
    RedBull beer = new RedBull();
    assertEquals(beer.getName(), RedBull.NAME);
    assertEquals(beer.getPrice(), RedBull.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForRedBull() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.noahboegli.RedBull";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = RedBull.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
