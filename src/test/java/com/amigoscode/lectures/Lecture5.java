package com.amigoscode.lectures;

import static com.amigoscode.mockdata.MockData.getCars;

import com.amigoscode.beans.Car;
import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;


import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class Lecture5 {

  @Test
  public void understandingFilter() throws Exception {

   ImmutableList<Car> cars = (ImmutableList<Car>) MockData.getCars();

    List<Car> carsFiltered = cars.stream()
        .filter(car -> car.getPrice() < 10000)
        .collect(Collectors.toList());

    carsFiltered.forEach(System.out::println);
    System.out.println(carsFiltered.size());


  }

  @Test
  public void ourFirstMapping() throws Exception {
    List<Person> people = MockData.getPeople();
  }

  @Test
  public void averageCarPrice() throws Exception {
    //calculate average of car prices
  }

}
