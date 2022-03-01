package ch.heigvd.api.chill.domain.fterrani;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class WhiteRussian implements IProduct {

  public final static String NAME = "White Russian";
  public final static BigDecimal PRICE = new BigDecimal(5.8);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
