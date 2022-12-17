package com.amigoscode.lectures;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Lecture11 {

  @Test
  public void joiningStrings() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "helena", "yasmin");

    String join = "";

    for (String name : names) {
      join += name + ", ";
    }
    System.out.println(join.substring(0, join.length() -2));
  }

  @Test
  public void joiningStringsWithStreams() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "helena", "yasmin");
  }

}
