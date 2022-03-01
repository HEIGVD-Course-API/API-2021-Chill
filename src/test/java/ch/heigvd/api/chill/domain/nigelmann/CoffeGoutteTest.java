package ch.heigvd.api.chill.domain.nigelmann;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.domain.nigelmann.CoffeeGoutte;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeGoutteTest {

  @Test
  void thePriceAndNameForCoffeeGoutteShouldBeCorrect() {
    CoffeeGoutte goutte = new CoffeeGoutte();
    assertEquals(goutte.getName(), CoffeeGoutte.NAME);
    assertEquals(goutte.getPrice(), CoffeeGoutte.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCoffeeGoutte() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.nigelmann.CoffeeGoutte";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = CoffeeGoutte.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
