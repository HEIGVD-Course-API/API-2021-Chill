package ch.heigvd.api.chill.domain.Kitsunemma;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class Pecheresse implements IProduct {

  public final static String NAME = "Pecheresse";
  public final static BigDecimal PRICE = new BigDecimal(3.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
