package com.example;


public class Greeter {

  /**
  *methode qui dite bonjour a quelqu'un
  *@return String
  */
  public Greeter() {

  }

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
