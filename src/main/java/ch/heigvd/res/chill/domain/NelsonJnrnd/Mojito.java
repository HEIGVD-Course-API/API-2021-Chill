package ch.heigvd.res.chill.domain.NelsonJnrnd;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Mojito implements IProduct {

  public final static String NAME = "Mojito";
  public final static BigDecimal PRICE = new BigDecimal(8);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
