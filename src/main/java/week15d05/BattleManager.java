package week15d05;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BattleManager {

    public List<Battle> readLines(BufferedReader reader) throws IOException {
        List<Battle> battles = new ArrayList<>();
        String line;
        reader.readLine();
        while ((line = reader.readLine())  != null) {
            String[] parts = line.split(",");
            String attacker = parts[5];
            String attacker2 = parts[6];
            String defender = parts[9];
            String defender2 = parts[10];
            String outcome = parts[13];
            if(outcome.equals("win")) {
                battles.add(new Battle(Outcome.WIN,attackersGenerator(attacker,attacker2),defendersGenerator(defender,defender2)));
            } else {
                battles.add(new Battle(Outcome.LOSS,attackersGenerator(attacker,attacker2),defendersGenerator(defender,defender2)));
            }
        }
        return battles;
    }
    public List<String> attackersGenerator(String... attackers) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < attackers.length; i++) {
            if(!isEmpty(attackers[i])) {
                result.add(attackers[i]) ;
            } }
        return result;
    }
    public List<String> defendersGenerator(String... defenders) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < defenders.length; i++) {
            if(!isEmpty(defenders[i])) {
                result.add(defenders[i]) ;
            } }
        return result;
    }

    private boolean isEmpty(String str) {
        return str == null || str.trim().equals("");
    }


    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/battles.csv"))) {
            BattleManager bm = new BattleManager();
            List<Battle> result = bm.readLines(reader);
            System.out.println(result);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}


