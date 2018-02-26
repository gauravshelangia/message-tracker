package com.example.message.tracking.messagetracking.rest.web;

import org.apache.commons.io.IOUtils;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by gaurav on 26/02/18.
 */
public class Test {

  public static void main(String[] args) throws IOException {

    File file = new File("src/main/resources/static/image.png");
    Image image = ImageIO.read(file);

    InputStream inputStream = new FileInputStream(file);

    byte[] imageArray = IOUtils.toByteArray(inputStream);
    System.out.println(imageArray);
  }
}
