package collectionsmap;

import java.security.KeyStore;
import java.time.LocalDate;
import java.util.*;

public class LogParser {
    public Map<String, List<Entry>> parseLog(String log) {

        try (Scanner scanner = new Scanner(log)) {
            Map<String, List<Entry>> elements = new HashMap<>();

            while (scanner.hasNext()) {
                String line = scanner.next();
                String[] lineElements = line.split(":");
                if (lineElements.length != 3) {
                    throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
                }
                LocalDate entryDate = formatDate(lineElements[1]);
                fillMap(elements, new Entry(lineElements[0], lineElements[2], entryDate));
            }
            return elements;
        }
    }
    private void fillMap(Map<String, List<Entry>> elements, Entry entry) {
        if (!elements.containsKey(entry.getIpAddress())) {
            elements.put(entry.getIpAddress(), new ArrayList<>());
        }

        elements.get(entry.getIpAddress()).add(entry);
    }

    public LocalDate formatDate(String dateInString) {
        if(!dateInString.contains("-")) {
            throw new IllegalArgumentException("Incorrect log: incorrect date");
        }
        String[] parts = dateInString.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return LocalDate.of(year,month,day);
    }

}
