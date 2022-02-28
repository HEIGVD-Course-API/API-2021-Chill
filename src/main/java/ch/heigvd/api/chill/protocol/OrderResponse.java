package ch.heigvd.api.chill.protocol;

//import lombok.Data;

import java.math.BigDecimal;

//@Data
public class OrderResponse implements IMessage {

  private final BigDecimal totalPrice;

  public OrderResponse(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
  }

  public BigDecimal getTotalPrice(){
    return totalPrice;
  }
}
