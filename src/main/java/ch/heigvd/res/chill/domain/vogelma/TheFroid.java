package ch.heigvd.res.chill.domain.vogelma;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class TheFroid implements IProduct {

  public final static String NAME = "The froid peche";
  public final static BigDecimal PRICE = new BigDecimal(1.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
