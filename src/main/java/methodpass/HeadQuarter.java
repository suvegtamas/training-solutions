package methodpass;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    List<Trooper> troopers = new ArrayList<>();
    public List<Trooper> getTroopers() {
       return troopers;
    }
    public void addTrooper(Trooper trooper) {
        troopers.add(trooper);
    }
    public void moveTrooperByName(String name, Position target) {
      for ( Trooper t : troopers) {
          if (t.getName().equals(name)) {
              t.changePosition(target);
          }
      }
    }
    public Trooper findClosestTrooper(Position target) {
        Trooper closest = troopers.get(0);
        for (Trooper t : troopers) {
            if(t.distanceFrom(target) < closest.distanceFrom(target)) {
                closest = t;
            }
        }
        return closest;
    }
    private Trooper findByName(String name) {
        Trooper result = null;
        for ( Trooper t : troopers) {
            if ( t.getName().equals(name)) {
               result =  t;
            }
        }
        return result;
    }
    public void moveClosestTrooper(Position target) {
        Trooper closest = findClosestTrooper(target);
        if ( closest != null) {
            moveTrooper(closest, target);
        }
    }
    private void moveTrooper(Trooper trooper,Position target) {
        trooper.changePosition(target);
    }
}
