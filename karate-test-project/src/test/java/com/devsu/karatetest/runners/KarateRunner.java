package com.devsu.karatetest.runners;

import com.intuit.karate.junit5.Karate;

public class KarateRunner {

  @Karate.Test
  public Karate testAll() {
    return Karate.run().path("classpath:com/devsu/karatetest/features/");
  }
}
