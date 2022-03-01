package ch.heigvd.api.chill.domain.fterrani;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChateauHautBrion1959Test
{

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    ChateauHautBrion1959 beer = new ChateauHautBrion1959();
    assertEquals(beer.getName(), ChateauHautBrion1959.NAME);
    assertEquals(beer.getPrice(), ChateauHautBrion1959.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.fterrani.ChateauHautBrion1959";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = ChateauHautBrion1959.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
