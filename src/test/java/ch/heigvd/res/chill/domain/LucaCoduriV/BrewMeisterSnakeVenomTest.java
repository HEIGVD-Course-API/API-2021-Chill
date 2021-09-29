package ch.heigvd.res.chill.domain.LucaCoduriV;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BrewMeisterSnakeVenomTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    BrewMeisterSnakeVenom beer = new BrewMeisterSnakeVenom();
    assertEquals(beer.getName(), BrewMeisterSnakeVenom.NAME);
    assertEquals(beer.getPrice(), BrewMeisterSnakeVenom.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCuveeDesTrolls() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.LucaCoduriV.BrewMeisterSnakeVenom";

    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = BrewMeisterSnakeVenom.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}