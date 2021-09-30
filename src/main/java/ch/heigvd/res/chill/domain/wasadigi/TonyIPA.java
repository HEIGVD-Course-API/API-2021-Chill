package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class TonyIPA implements IProduct {

  public final static String NAME = "Tony's IPA";
  public final static BigDecimal PRICE = new BigDecimal(3);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
