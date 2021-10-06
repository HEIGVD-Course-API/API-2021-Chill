package ch.heigvd.res.chill.domain.luhrel;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class LaBlonde implements IProduct {
    public final static String NAME = "La Blonde";
    public final static BigDecimal PRICE = new BigDecimal(3);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
