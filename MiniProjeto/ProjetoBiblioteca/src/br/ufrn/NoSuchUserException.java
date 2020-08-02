package br.ufrn;

public class NoSuchUserException extends Exception{
  public NoSuchUserException(String mensagem){
    super(mensagem);
  }
}

