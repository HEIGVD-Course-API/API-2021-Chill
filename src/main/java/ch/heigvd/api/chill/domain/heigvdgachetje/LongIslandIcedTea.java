package ch.heigvd.api.chill.domain.heigvdgachetje;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class LongIslandIcedTea implements IProduct {

    public final static String NAME = "Long Island Iced Tea";
    public final static BigDecimal PRICE = new BigDecimal(6.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
