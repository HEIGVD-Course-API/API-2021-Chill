package ch.heigvd.api.chill.domain.nigelmann;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class Vodka implements IProduct {

    public final static String NAME = "Royal Dragon: The Eye of the Dragon";
    public final static BigDecimal PRICE = new BigDecimal(5500000);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
