package ch.heigvd.res.chill.domain.MordoJ;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Duvel;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LatteMacchiatoTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    LatteMacchiato beer = new LatteMacchiato();
    assertEquals(beer.getName(), LatteMacchiato.NAME);
    assertEquals(beer.getPrice(), LatteMacchiato.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MordoJ.LatteMacchiato";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = LatteMacchiato.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}