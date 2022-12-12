package com.amigoscode.lectures;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Lecture6 {

  @Test
  public void findAny() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int  any = Arrays.stream(numbers)
        .filter(n -> n < 10)
        .findAny()
        .get();

    System.out.println(any);
  }

  public void findFirst() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
  }

}
