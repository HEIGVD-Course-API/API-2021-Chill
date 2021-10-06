package ch.heigvd.res.chill.domain.b0ogieMan;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlaceboTest {

  @Test
  void thePriceAndNameForPlaceboShouldBeCorrect() {
    Placebo beer = new Placebo();
    assertEquals(beer.getName(), Placebo.NAME);
    assertEquals(beer.getPrice(), Placebo.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPlacebo() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.b0ogieMan.Placebo";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Placebo.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}