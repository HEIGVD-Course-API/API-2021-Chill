package ch.heigvd.res.chill.domain.Isotech42;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class MigrosIceTea implements IProduct {

  public final static String NAME = "MigrosIceTea";
  public final static BigDecimal PRICE = new BigDecimal(0.9);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
