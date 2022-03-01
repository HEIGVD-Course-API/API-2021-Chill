package ch.heigvd.api.chill.domain.fterrani;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class ChateauHautBrion1959 implements IProduct {

  public final static String NAME = "Château Haut-Brion 1959";
  public final static BigDecimal PRICE = new BigDecimal(500.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
