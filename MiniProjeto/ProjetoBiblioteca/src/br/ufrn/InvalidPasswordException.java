package br.ufrn;

public class InvalidPasswordException extends Exception{
  public InvalidPasswordException(String message){
    super(message);
  }
}
