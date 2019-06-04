package com.github.mgljava.tdd.tddpractice.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberGameTest {

  @Test
  public void should_get_itself() {
    // given

    // when
    String result = new NumberGame().calc(1);
    String result2 = new NumberGame().calc(11);

    // then
    assertEquals("1", result);
    assertEquals("11", result2);
  }

  @Test
  public void should_get_fizz_when_number_multiple_of_3() {
    // given

    // when
    final String result = new NumberGame().calc(3);
    final String result2 = new NumberGame().calc(21);

    // then
    assertEquals("fizz", result);
    assertEquals("fizz", result2);
  }

  @Test
  public void should_get_buzz_when_number_multiple_of_5() {
    // given

    // when
    final String result = new NumberGame().calc(10);
    final String result2 = new NumberGame().calc(55);

    // then
    assertEquals("buzz", result);
    assertEquals("buzz", result2);
  }

  @Test
  public void should_get_fizzbuzz_when_number_multiple_of_3_and_5() {
    // given

    // when
    final String result = new NumberGame().calc(45);
    final String result2 = new NumberGame().calc(60);

    // then
    assertEquals("fizzbuzz", result);
    assertEquals("fizzbuzz", result2);
  }
}
