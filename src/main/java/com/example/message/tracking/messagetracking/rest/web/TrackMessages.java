package com.example.message.tracking.messagetracking.rest.web;

import io.swagger.annotations.Api;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

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
  public void isMessageOpened(String id, String messageId) throws IOException {
    logger.error("Below is the details {} , {}", id, messageId);
    System.out.println("Below is the sout detail of message " + id + "  " + messageId);
    File file = new File("src/main/resources/static/image.png");
    InputStream inputStream = null;
    byte[] imageArray = null;
    try {
      inputStream = new FileInputStream(file);
      imageArray = IOUtils.toByteArray(inputStream);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    finally {
      try {
        inputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
//     return imageArray;
  }
}
