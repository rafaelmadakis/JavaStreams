package com.amigoscode.lectures;

import com.amigoscode.mockdata.MockData;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class Lecture13 {

  @Test
  public void intermediateAndTerminalOperations() throws Exception {
    System.out.println(
        MockData.getCars()
            .stream()
            .filter(car -> {
              System.out.println("Filter car " + car);
              return car.getPrice() < 10000;
            })
            .map(car -> {
              System.out.println("mapping car " + car);
              return car.getPrice();
            })
            .map(price -> {
              System.out.println("mapping price " + price);
              return price + (price * .14);
            })
            .collect(Collectors.toList())
    );
  }

}
