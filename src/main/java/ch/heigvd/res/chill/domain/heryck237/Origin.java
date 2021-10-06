package ch.heigvd.res.chill.domain.heryck237;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Origin implements IProduct {

    public final static String NAME = "Origin";
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