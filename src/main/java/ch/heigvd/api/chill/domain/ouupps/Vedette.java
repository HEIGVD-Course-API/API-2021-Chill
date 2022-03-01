package ch.heigvd.api.chill.domain.ouupps;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class Vedette implements IProduct {

  public final static String NAME = "Vedette";
  public final static BigDecimal PRICE = new BigDecimal(6.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
