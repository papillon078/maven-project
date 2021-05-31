package com.example;

/**
*classe greeter qui dit bonjour a qq
*/
public class Greeter {

  /**
  *constructeur de classe
  */
  public Greeter() {

  }
  
  /**
  *methode qui dite bonjour a quelqu'un
  *@param String
  *@return String
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
