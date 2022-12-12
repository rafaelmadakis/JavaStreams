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
    List<Car> cars = MockData.getCars();
  }

  public void max() throws Exception {
    List<Car> cars = MockData.getCars();
  }

  public void anerage() throws Exception {
    List<Car> cars = MockData.getCars();
  }

  public void sum() throws Exception {
    List<Car> cars = MockData.getCars();
  }

  public void statistics() throws Exception {
    List<Car> cars = MockData.getCars();
  }

}
