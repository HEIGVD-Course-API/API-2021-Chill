package ch.heigvd.api.chill.domain.fterrani;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class Vesper implements IProduct {

  public final static String NAME = "Vesper";
  public final static BigDecimal PRICE = new BigDecimal(7.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
