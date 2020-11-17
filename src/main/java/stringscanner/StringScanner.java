package stringscanner;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StringScanner {
    public boolean isEmpty(String s) {
        return s == null || "".equals(s.trim());
    }

    public int readAndSumValues(String intString, String delimiter) {
        try (Scanner scanner = new Scanner(intString)) {
            if (!isEmpty(delimiter)) {
                scanner.useDelimiter(delimiter);
            }
            return calculateWithScanner(scanner);
        }
    }
    public int readAndSumValues(String intString) {
        return readAndSumValues(intString, null);
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        if (isEmpty(text) || word == null || "".equals(word)) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        try (Scanner sc = new Scanner(text)) {
            StringBuilder sb = new StringBuilder();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.contains(word)) {
                    sb.append(line);
                    sb.append("\n");
                }
            }
            return sb.toString().trim();
        }
    }
    private int calculateWithScanner(Scanner sc) {
        int sum = 0;
        try {
            while (sc.hasNext()) {
                sum += sc.nextInt();
            }
        } catch (InputMismatchException ex) {
            throw new IllegalArgumentException("Incorrect parameter string!", ex);
        }
        return sum;
    }
}
