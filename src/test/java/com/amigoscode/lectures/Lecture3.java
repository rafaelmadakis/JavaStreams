package com.amigoscode.lectures;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Lecture3 {

  @Test
  public void min() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);

    Integer min = numbers.stream()
        .min(Comparator.naturalOrder())
        .get();

    assertThat(min).isEqualTo(1);
    System.out.println(min);

  }

  public void max() throws Exception {
    final List<Integer> numebers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
  }

}
