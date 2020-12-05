package io.aleksandr.labs.sbdemo;

import io.aleksandr.labs.sbdemo.api.model.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

  @LocalServerPort
  private int port;

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  void message() {
    final ResponseEntity<Message> response = restTemplate.getForEntity("/api/message", Message.class);

    assertEquals(200, response.getStatusCode().value());
    assertEquals("in a bottle", response.getBody().getMessage());
  }
}
