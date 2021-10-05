package ch.heigvd.res.chill.domain.damienmaier;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class FortyTwo implements IProduct {
    public final static String NAME = "FortyTwo";
    public static final BigDecimal PRICE = new BigDecimal(4.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
