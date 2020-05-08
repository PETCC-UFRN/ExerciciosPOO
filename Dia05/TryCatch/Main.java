class Main {
  public static void main(String[] args) {
    try {
      Jumper j = new Jumper();
      j.jump();
    }
    catch(Exception e)
    {
      System.out.println("Ouch!");
      return;
    }
    finally 
    {
      System.out.println("Keep Calm and Carry On");
    }
    System.out.println("Let's jump again!");
  }
}

