package com.amigoscode.lectures;

import com.amigoscode.beans.Car;
import com.amigoscode.mockdata.MockData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

public class Lecture8 {

  @Test
  public void simpleGrouping() throws Exception {
    Map<String, List<Car>> grouping = MockData.getCars()
        .stream()
        .collect(Collectors.groupingBy(Car::getMake));

    grouping.forEach((make, cars) -> {
      System.out.println(make);
      cars.forEach(System.out::println);
    });

  }

  public void  groupingAndCounting() throws  Exception {
    ArrayList<String> names = Lists
        .newArrayList("John",
            "John",
            "Marian",
            "Alex",
            "Mohammado",
            "Mohammado",
            "Vincent",
            "Alex",
            "Alex"
        );
  }

}
