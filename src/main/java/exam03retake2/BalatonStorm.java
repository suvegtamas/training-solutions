package exam03retake2;


import java.io.BufferedReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BalatonStorm {
    public List<String> getStationsInStorm(BufferedReader reader) throws IOException {
        List<String> result = new ArrayList<>();
        String station = "";
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("allomas")) {
                String[] parts = line.split(": ");
                String name = parts[1];
                station = name.substring(1, name.length() - 2);
            }
            if (line.contains("level\": 3")) {
                result.add(station);
            }

        }
        result.sort(Collator.getInstance(new Locale("hu", "HU")));
        return result;
    }

}
