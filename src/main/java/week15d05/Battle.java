package week15d05;

import java.util.List;

public class Battle {
    private Outcome outcome;
    private List<String> attackers;
    private List<String> defenders;

    public Battle(Outcome outcome, List<String> attackers, List<String> defenders) {
        this.outcome = outcome;
        this.attackers = attackers;
        this.defenders = defenders;
    }

    public Outcome getOutcome() {
        return outcome;
    }

    public List<String> getAttackers() {
        return attackers;
    }

    public List<String> getDefenders() {
        return defenders;
    }

    @Override
    public String toString() {
        return "Battle{" +
                "outcome=" + outcome +
                ", attackers=" + attackers +
                ", defenders=" + defenders +
                '}';
    }
}
