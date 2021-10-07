package ch.heigvd.res.chill.domain.vogelma;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheFroidTest {

  @Test
  void thePriceAndNameForTheFroidShouldBeCorrect() {
    TheFroid brew = new TheFroid();
    assertEquals(brew.getName(), TheFroid.NAME);
    assertEquals(brew.getPrice(), TheFroid.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSinalco() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.vogelma.TheFroid";
    OrderRequest request = new OrderRequest(2, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = TheFroid.PRICE.multiply(new BigDecimal(2));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}