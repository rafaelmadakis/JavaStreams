package com.amigoscode.lectures;

import com.amigoscode.beans.Car;
import com.amigoscode.mockdata.MockData;
import com.google.common.collect.ImmutableList;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Lecture7 {

  @Test
  public void count() throws Exception {
    long count = MockData.getPeople()
        .stream()
        .filter(person -> person.getGender().equalsIgnoreCase("female"))
        .count();
    System.out.println(count);
  }

  @Test
  public void min() throws Exception {
    double min = MockData.getCars()
        .stream()
        .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
        .mapToDouble(Car::getPrice)
        .min()
        .orElse(0);
    System.out.println(min);

  }

  @Test
  public void max() throws Exception {
    double max = MockData.getCars()
        .stream()
        .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
        .mapToDouble(Car::getPrice)
        .max()
        .orElse(0);
    System.out.println(max);
  }

  @Test
  public void average() throws Exception {
    List<Car> cars = MockData.getCars();

//    ImmutableList<Car> cars = ImmutableList.of();
    double averagePrice = cars.stream()
        .mapToDouble(Car::getPrice)
        .average()
        .orElse(0);
    System.out.println(averagePrice);
  }

  @Test
  public void sum() throws Exception {
    List<Car> cars = MockData.getCars();
    double sum = cars.stream()
        .mapToDouble(Car::getPrice)
        .sum();
    BigDecimal bigDecimal = BigDecimal.valueOf(sum);
    System.out.println(sum);
    System.out.println(bigDecimal);
  }

  public void statistics() throws Exception {
    List<Car> cars = MockData.getCars();
  }

}
