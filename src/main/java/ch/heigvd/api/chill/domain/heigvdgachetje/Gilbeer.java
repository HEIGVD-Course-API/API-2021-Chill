package ch.heigvd.api.chill.domain.heigvdgachetje;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class Gilbeer implements IProduct {

    public final static String NAME = "Gilbeera";
    public final static BigDecimal PRICE = new BigDecimal(4.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
