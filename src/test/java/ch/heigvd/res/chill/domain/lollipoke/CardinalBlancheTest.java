package ch.heigvd.res.chill.domain.lollipoke;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardinalBlancheTest {

  @Test
  void thePriceAndNameForCardinalBlancheShouldBeCorrect() {
    CardinalBlanche beer = new CardinalBlanche();
    assertEquals(beer.getName(), CardinalBlanche.NAME);
    assertEquals(beer.getPrice(), CardinalBlanche.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCardinalBlanche() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.lollipoke.CardinalBlanche";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = CardinalBlanche.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}