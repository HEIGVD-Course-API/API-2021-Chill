package ch.heigvd.res.chill.domain.LucaCoduriV;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class BrewMeisterSnakeVenom implements IProduct {

  
  public final static String NAME = "BrewMeister Snake Venom";
  public final static BigDecimal PRICE = new BigDecimal(5.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
