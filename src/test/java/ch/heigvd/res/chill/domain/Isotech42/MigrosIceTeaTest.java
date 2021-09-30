package ch.heigvd.res.chill.domain.Isotech42;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MigrosIceTeaTest {

  @Test
  void thePriceAndNameForMigrosIceTeaShouldBeCorrect() {
    MigrosIceTea beer = new MigrosIceTea();
    assertEquals(beer.getName(), MigrosIceTea.NAME);
    assertEquals(beer.getPrice(), MigrosIceTea.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMigrosIceTea() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Isotech42.MigrosIceTea";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = MigrosIceTea.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}