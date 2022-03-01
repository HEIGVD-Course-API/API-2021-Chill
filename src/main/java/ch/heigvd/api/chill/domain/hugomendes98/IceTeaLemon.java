package ch.heigvd.api.chill.domain.hugomendes98;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class IceTeaLemon implements IProduct {

    public final static String NAME = "Ice Tea (Lemon)";
    public final static BigDecimal PRICE = new BigDecimal(0.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
