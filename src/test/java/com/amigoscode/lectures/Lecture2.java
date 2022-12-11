package com.amigoscode.lectures;

import com.amigoscode.beans.Person;
import com.amigoscode.examples.IntStreams;
import com.amigoscode.mockdata.MockData;
import java.util.List;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

public class Lecture2 {

  @Test
  public void range() throws Exception {

    System.out.println(" For i");


    for (int i = 0; i <= 10; i++) {
      System.out.println(i);
    }

    System.out.println("Exclusive");
    System.out.println();
    IntStream.range(0, 10)
        .forEach(System.out::println);

    System.out.println("Inclusive");

    IntStream.rangeClosed(0,10)
        .forEach(System.out::println);

  }

  @Test
  public void rangeIteratingList() throws Exception {
    List<Person> people = MockData.getPeople();
    IntStream.range(0, people.size())
        .forEach(index -> {
          Person person = people.get(index);
          System.out.println(person);
        });
  }

  @Test
  public void intStreamIterate() throws Exception {

    IntStream.iterate(0, operand -> operand + 1)
        .filter(number -> number % 2 == 0)
        .limit(20)
        .forEach(System.out::println);

  }


}
