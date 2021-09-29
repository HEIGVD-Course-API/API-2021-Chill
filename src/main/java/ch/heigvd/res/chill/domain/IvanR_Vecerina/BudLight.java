package ch.heigvd.res.chill.domain.IvanR_Vecerina;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class BudLight implements IProduct {

  public final static String NAME = "BudLight";
  public final static BigDecimal PRICE = new BigDecimal(1.3);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
