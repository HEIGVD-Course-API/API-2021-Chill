package ch.heigvd.api.chill.domain.noahboegli;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class RedBull implements IProduct {

  public final static String NAME = "RedBull";
  public final static BigDecimal PRICE = new BigDecimal(3.7);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
