package ch.heigvd.res.chill.domain.MbayoG;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KriekTest {

  @Test
  void thePriceAndNameForKriekShouldBeCorrect() {
    Kriek beer = new Kriek();
    assertEquals(beer.getName(), Kriek.NAME);
    assertEquals(beer.getPrice(), Kriek.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForKriek() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MbayoG.Kriek";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Kriek.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}