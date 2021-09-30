package ch.heigvd.res.chill.domain.Webblitchy;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class VanillaCoke implements IProduct {

    public final static String NAME = "Vanilla Coke";
    public final static BigDecimal PRICE = new BigDecimal(0.85);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
