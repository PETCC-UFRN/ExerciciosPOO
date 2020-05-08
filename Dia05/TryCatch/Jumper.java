import java.util.Random;

class Jumper {
  public void jump() throws Exception
  {
    Random random = new Random();
    int c = random.nextInt(10);

    if (c == 0)
    {
      System.out.println("I fell");
      throw new Exception();
    }
    else {
      System.out.println("I'm alright");
    }
  }
}

