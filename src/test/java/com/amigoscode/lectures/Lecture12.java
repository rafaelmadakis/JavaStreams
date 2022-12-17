package com.amigoscode.lectures;

import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class Lecture12 {

  @Test
  public void understandingCollect() throws Exception {
    List<String> emails = MockData.getPeople()
        .stream()
        .map(Person::getEmail)
            .collect(
                ArrayList::new,
                ArrayList::add,
                ArrayList::addAll
            );
//        .collect(Collectors.toList());

    emails.forEach(System.out::println);
  }

}
