package ch.heigvd.res.chill.domain.IvanR_Vecerina;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BudLightTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    BudLight beer = new BudLight();
    assertEquals(beer.getName(), BudLight.NAME);
    assertEquals(beer.getPrice(), BudLight.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jamie = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.IvanR_Vecerina.BudLight";
    OrderRequest request = new OrderRequest(16, productName);
    OrderResponse response = jamie.order(request);
    BigDecimal expectedTotalPrice = BudLight.PRICE.multiply(new BigDecimal(16));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}