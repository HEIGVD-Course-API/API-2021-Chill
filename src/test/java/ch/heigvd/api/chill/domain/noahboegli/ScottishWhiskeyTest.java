package ch.heigvd.api.chill.domain.noahboegli;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.domain.noahboegli.ScottishWhiskey;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScottishWhiskeyTest {

  @Test
  void thePriceAndNameForScottishWhiskeyShouldBeCorrect() {
    ScottishWhiskey sw = new ScottishWhiskey();
    assertEquals(sw.getName(), ScottishWhiskey.NAME);
    assertEquals(sw.getPrice(), ScottishWhiskey.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForScottishWhiskey() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.api.chill.domain.noahboegli.ScottishWhiskey";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = ScottishWhiskey.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
