package ch.heigvd.api.chill.protocol;

import lombok.Data;

@Data
public class GreetingsResponse implements IMessage {

  private final String text;

}
