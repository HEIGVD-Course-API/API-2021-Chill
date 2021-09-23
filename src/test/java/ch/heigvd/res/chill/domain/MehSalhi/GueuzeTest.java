package ch.heigvd.res.chill.domain.MehSalhi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GueuzeTest {

  @Test
  void thePriceAndNameForGueuzeShouldBeCorrect() {
    Gueuze beer = new Gueuze();
    assertEquals(beer.getName(), Gueuze.NAME);
    assertEquals(beer.getPrice(), Gueuze.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGueuze() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MehSalhi.Gueuze";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Gueuze.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}