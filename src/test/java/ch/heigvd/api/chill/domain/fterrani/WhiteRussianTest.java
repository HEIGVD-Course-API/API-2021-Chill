package ch.heigvd.api.chill.domain.fterrani;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WhiteRussianTest
{

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    WhiteRussian beer = new WhiteRussian();
    assertEquals(beer.getName(), WhiteRussian.NAME);
    assertEquals(beer.getPrice(), WhiteRussian.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.fterrani.WhiteRussian";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = WhiteRussian.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
