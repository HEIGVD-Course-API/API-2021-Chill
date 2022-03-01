package ch.heigvd.api.chill.domain.noahboegli;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class Rhum implements IProduct {

  public final static String NAME = "Rhum";
  public final static BigDecimal PRICE = new BigDecimal(2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
