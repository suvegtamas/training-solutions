package math.game;

import math.Point;

public class Game {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Joachim",new Point(5, 7));
        Warrior warrior2 = new Warrior("Khales",new Point(1, 9));

      for (int round = 1; warrior1.isAlive() && warrior2.isAlive(); round++) {
          System.out.println("Round: " + round);
          System.out.println(warrior1);
          System.out.println(warrior2);
          if ( warrior1.distance(warrior2) > 0) {
              warrior1.move(warrior2);
              warrior2.move(warrior1);

          } else {
              warrior1.attack(warrior2);
              warrior2.attack(warrior1);
          }
      }
        System.out.println("Winner: " + (warrior1.isAlive() ? warrior1 : warrior2) );
    }
}
