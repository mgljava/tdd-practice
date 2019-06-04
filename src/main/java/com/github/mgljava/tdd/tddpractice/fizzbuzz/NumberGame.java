package com.github.mgljava.tdd.tddpractice.fizzbuzz;

import static java.lang.String.valueOf;

public class NumberGame {

  public String calc(int number) {
    if (isDivide(number, 3) && isDivide(number, 5)) {
      return "fizzbuzz";
    }
    if (isDivide(number, 3)) {
      return "fizz";
    }
    if (isDivide(number, 5)) {
      return "buzz";
    }
    return valueOf(number);
  }

  private boolean isDivide(int number, int i) {
    return number % i == 0;
  }
}
