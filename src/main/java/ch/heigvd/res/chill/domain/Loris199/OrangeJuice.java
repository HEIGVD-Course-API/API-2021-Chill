package ch.heigvd.res.chill.domain.Loris199;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class OrangeJuice implements IProduct {

  public final static String NAME = "OrangeJuice";
  public final static BigDecimal PRICE = new BigDecimal(0.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
