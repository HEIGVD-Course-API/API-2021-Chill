package ch.heigvd.res.chill.domain.b0ogieMan;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Foster implements IProduct {

  public final static String NAME = "Foster";
  public final static BigDecimal PRICE = new BigDecimal(2.8);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
