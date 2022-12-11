package com.amigoscode.lectures;

import static com.amigoscode.mockdata.MockData.getCars;
import static org.assertj.core.api.Assertions.assertThat;

import com.amigoscode.beans.Car;
import com.amigoscode.beans.Person;
import com.amigoscode.beans.PersonDTO;
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
    //transform one data type to another
    List<Person> people = MockData.getPeople();
    List<PersonDTO> dtos = people.stream()
        .map(PersonDTO::map)
        .collect(Collectors.toList());

    dtos.forEach(System.out::println);
    assertThat(dtos).hasSize(1000);

  }

  @Test
  public void averageCarPrice() throws Exception {
    //calculate average of car prices
    double average = getCars()
        .stream()
//        .mapToDouble(car -> car.getPrice())  //normal
        .mapToDouble(Car::getPrice)// reference
        .average()
        .orElse(0);

    System.out.println(average);

  }

}
