package NumberGuess;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Runner {
  public static void main(String[] args) { 
    int randomNum = ThreadLocalRandom.current().nextInt(0, 11);
    int guess = -100;
    System.out.println("Guess a numer");
    
    
    
    while (guess != randomNum) {
      Scanner in = new Scanner(System.in);
      guess = in.nextInt();
      if (guess > randomNum) {
        System.out.println("Go smaller");
      } 
      if (guess < randomNum){
        System.out.println("Go bigger");
      }
    }
//    in.close();
    System.out.println("YOU GOT IT!");
  }
}