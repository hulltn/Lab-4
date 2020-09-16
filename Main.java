/*
Lab 4
Tiernan Hull and Jake Knapke
9/16/2020
*/

import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(50) + 1;
    System.out.println("The random number is: " + randomNum);
    if (randomNum > 0)
      for (int count = randomNum; count >= 0; count--) 
      {
        System.out.println(count);
      }
    if (randomNum < 25)
    {
      System.out.println("Ahoy Matey's!");
    }
    else if (randomNum > 25 && randomNum < 42)
    {
      System.out.println("Cannonball!");
    }
    else 
    {
      System.out.println("Blast Off!");
    }
  }
}