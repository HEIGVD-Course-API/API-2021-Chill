package ch.heigvd.res.chill.domain.JFPasche;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class PaleAle26 implements IProduct  {
    public final static String NAME = "Pale Ale 26 Swizterland";
    public final static BigDecimal PRICE = new BigDecimal("3.2");

    @Override
    public String getName() {return NAME; }

    @Override
    public BigDecimal getPrice() {return PRICE; }
}
