package com.example;

/**
* classe greeter qui dit bonjour a qq
*/
public class Greeter {

  /**
  * constructeur de classe
  */
  public Greeter() {

  }
  
  /**
  * methode qui dite bonjour a quelqu'un
  * @param someone personne a qui on dit bonjour
  * @return bonjour en String
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
