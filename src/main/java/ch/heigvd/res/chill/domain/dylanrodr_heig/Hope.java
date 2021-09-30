package ch.heigvd.res.chill.domain.dylanrodr_heig;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Hope implements IProduct {

  public final static String NAME = "Hope";
  public final static BigDecimal PRICE = new BigDecimal(1.9);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
