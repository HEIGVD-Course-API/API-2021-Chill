package ch.heigvd.api.chill.protocol;

//import lombok.Data;

//@Data
public class GreetingsRequest implements IMessage {

  private final String text;

  public GreetingsRequest(String text) {
    this.text = text;
  }
}
