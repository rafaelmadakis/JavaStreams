package com.amigoscode.lectures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;

public class Lecture10 {

  private static  final List<ArrayList<String>> arrayListOfNames = Lists.newArrayList(
      Lists.newArrayList("Mariam", "Alex", "Ismail"),
      Lists.newArrayList("John", "Alesha", "Andre"),
      Lists.newArrayList("Susy", "Ali")
  );


  @Before
  public void seuUp() {
    System.out.println(arrayListOfNames);
  }

  @Test
  public void withoutFlapMap() throws Exception {
    // [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]
    List<String> names = Lists.newArrayList();

    for (List<String> listOfNames : arrayListOfNames) {
      for (String name : listOfNames) {
        names.add(name);
      }
    }
    System.out.println(names);
  }

  @Test
  public void withFlapMap() throws Exception {
    // [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]

    List<String> names = arrayListOfNames.stream()
//        .flatMap(strings -> strings.stream())
        .flatMap(Collection::stream) // method reference
        .collect(Collectors.toList());

    System.out.println(names);
  }
}
