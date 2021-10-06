package ch.heigvd.res.chill.domain.pain_da;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Bulmers implements IProduct {

  public final static String NAME = "Bulmers";
  public final static BigDecimal PRICE = new BigDecimal(8.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
