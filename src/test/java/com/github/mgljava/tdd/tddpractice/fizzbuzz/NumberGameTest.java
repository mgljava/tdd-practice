package com.github.mgljava.tdd.tddpractice.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberGameTest {

  @Test
  public void should_get_itself() {
    // given

    // when
    String result = new NumberGame().calc(1);

    // then
    assertEquals("1", result);
  }

  @Test
  public void should_get_fizz_when_number_is_divide_3_is_0() {
    // given

    // when
    final String result = new NumberGame().calc(3);

    // then
    assertEquals("fizz", result);
  }

  @Test
  public void should_get_buzz_when_number_is_divide_5_is_0() {
    // given

    // when
    final String result = new NumberGame().calc(10);

    // then
    assertEquals("buzz", result);
  }

  @Test
  public void should_get_fizzbuzz_when_number_is_divide_3_and_5_is_0() {
    // given

    // when
    final String result = new NumberGame().calc(45);

    // then
    assertEquals("fizzbuzz", result);
  }
}
