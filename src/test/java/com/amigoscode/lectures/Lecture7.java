package com.amigoscode.lectures;

import com.amigoscode.beans.Car;
import com.amigoscode.mockdata.MockData;
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
  }

  public void sum() throws Exception {
    List<Car> cars = MockData.getCars();
  }

  public void statistics() throws Exception {
    List<Car> cars = MockData.getCars();
  }

}
