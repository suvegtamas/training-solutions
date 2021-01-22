package ioreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {
    private List<State> states = new ArrayList<>();
    public void readStatesFromFile(String stringFileName) {
        Path file = Path.of("src/main/resources/" + stringFileName);
        try(BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while((line=br.readLine()) != null) {
                states.add(splitter(line));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }

    public List<State> getStates() {
        return new ArrayList<>(states);
    }
    public State splitter(String line) {
        String[] splitStr = line.split("-");
        return new State(splitStr[0],splitStr[1]);
    }
    public String findCapitalByStateName(String input) {
        for(State state : states) {
            if (state.getStateName().equals(input)) {
                return state.getCapital();
            }
        }
        throw new IllegalArgumentException("No state with this name!");
    }
}
