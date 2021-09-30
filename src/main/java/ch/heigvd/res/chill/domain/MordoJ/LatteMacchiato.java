package ch.heigvd.res.chill.domain.MordoJ;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class LatteMacchiato implements IProduct {

  public final static String NAME = "Latte macchiato";
  public final static BigDecimal PRICE = new BigDecimal(6.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
