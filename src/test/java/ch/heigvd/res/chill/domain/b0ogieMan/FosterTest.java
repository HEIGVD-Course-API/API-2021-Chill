package ch.heigvd.res.chill.domain.b0ogieMan;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FosterTest {

  @Test
  void thePriceAndNameForFosterShouldBeCorrect() {
    Foster beer = new Foster();
    assertEquals(beer.getName(), Foster.NAME);
    assertEquals(beer.getPrice(), Foster.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForFoster() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.b0ogieMan.Foster";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Foster.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}