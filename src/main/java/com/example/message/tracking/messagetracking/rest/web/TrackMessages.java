package com.example.message.tracking.messagetracking.rest.web;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaurav on 23/02/18.
 */
@RestController
@RequestMapping(value = "/message-tracking")
@Api(value = "Message Tracking Demo", description = "message tracking")
public class TrackMessages {

  Logger logger = LoggerFactory.getLogger(TrackMessages.class);

  @GetMapping(value = "/hello",
      produces = MediaType.APPLICATION_JSON_VALUE)
  public String hello() {
    logger.error("Below is the details {} , {}");
    System.out.println("Below is the sout detail of message ");
    return "hello";
  }

  @GetMapping(value = "/email",
      produces = MediaType.APPLICATION_JSON_VALUE)
  public String isMessageOpened(String id, String messageId) {
    logger.error("Below is the details {} , {}", id, messageId);
    System.out.println("Below is the sout detail of message " + id + "  " + messageId);
    return id + "   " + messageId;
  }
}