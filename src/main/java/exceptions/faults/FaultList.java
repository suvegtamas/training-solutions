package exceptions.faults;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FaultList {
    public List<String> processLines(List<String> lines) {
        if (lines == null) {
            throw new IllegalArgumentException();
        }
        List<String> faults = new ArrayList<>();
        for (String s : lines) {
            String[] content = s.split(",");
            if (checkId(content[0]) != -1) {
                ProcessingResult pr = processLine(content);
                if (pr != ProcessingResult.NO_ERROR) {
                    faults.add(faultLine(checkId(content[0]), pr.getCode()));
                }
            }

        }
        return faults;
    }

    private int checkId(String id) {
        try {
            return Integer.parseInt(id);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private boolean isValidValue(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
           return false;
        }
    }
    private ProcessingResult processLine(String[] words) {
        if (words.length != 3) {
            return ProcessingResult.WORD_COUNT_ERROR;
        }

        boolean valueIsValid =  isValidValue(words[1]);
        boolean dateIsValid = isValidDate(words[2]);

        if (!valueIsValid && !dateIsValid) {
            return ProcessingResult.VALUE_AND_DATE_ERROR;
        }
        else if (!dateIsValid) {
            return ProcessingResult.DATE_ERROR;
        }
        else if (!valueIsValid) {
            return ProcessingResult.VALUE_ERROR;
        }

        return ProcessingResult.NO_ERROR;
    }

    private boolean isValidDate(String word) {
        try {
            DateFormat df = new SimpleDateFormat("yyyy.MM.dd.");
            df.parse(word);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }

    private String faultLine(int lineNumber, int resultCode) {
        return lineNumber + "," + resultCode;
    }
}
