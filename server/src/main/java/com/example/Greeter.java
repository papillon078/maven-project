package com.example;


public class Greeter {

  /**
  *classe qui dite bonjour a quelqu'un
  *
  */
  public Greeter() {

  }
  /**
  *methode qui dite bonjour a quelqu'un
  *@return String
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
