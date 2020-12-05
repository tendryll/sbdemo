package io.aleksandr.labs.sbdemo.api;

import io.aleksandr.labs.sbdemo.api.model.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/api")
public class RestApi {

  @GetMapping(path = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
  public Message message() {
    final Message message = new Message();
    message.setMessage("in a bottle");

    return message;
  }
}
