package com.amigoscode.lectures;

import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;
import java.io.IOException;
import java.time.Period;
import java.util.List;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

public class Lecture1 {

  @Test
  public void imperativeApproach() throws IOException {
    List<Person> people = MockData.getPeople();
    // 1. Find people aged less or equal 18
    // 2. Then change implementation to find first 10 people

    List<Person> youngPeople = Lists.newArrayList();

    final int limit = 10;
    int counter = 0;

    for (Person person : people) {
      if (person.getAge() <= 18) {
        youngPeople.add(person);
        counter++;
        if (counter == limit) {
          break;
        }
      }
    }
    for ( Person young : youngPeople) {
      System.out.println(young);
    }
  }

  public void declaretiveApproachUsingStreams() throws IOException {
    List<Person> people = MockData.getPeople();

  }


}
