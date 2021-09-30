package ch.heigvd.res.chill.domain.MaximGY;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class IceTea implements IProduct {

    public static final String NAME = "IceTea";
    public static final BigDecimal PRICE = new BigDecimal(1.8);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
