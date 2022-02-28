package ch.heigvd.api.chill.protocol;

//import lombok.Data;

//@Data
public class OrderRequest implements IMessage {

  private final int quantity;
  private final String productName;

  public OrderRequest(int quantity, String productName) {
    this.quantity = quantity;
    this.productName = productName;
  }

  public String getProductName() {
    return productName;
  }

  public int getQuantity(){
    return quantity;
  }
}
