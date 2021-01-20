package exceptionmulticatch;

import java.util.logging.Logger;

public class AnswerStat {
    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String input) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(input);
        } catch (NullPointerException nfe) {
            throw new InvalidBinaryStringException("binaryString null");
        } catch (IllegalArgumentException e) {
            throw new InvalidBinaryStringException("binaryString not valid");
        }
    }

    public int answerTruePercent(String input) {
        int percent = 100;
        int countFalse = 0;
        int countTrue = 0;
        for(char c : input.toCharArray()) {
            if (c == '0') {
                countFalse++;
            } else if(c == '1') {
                countTrue++;
            }
        }
        if(countFalse == countTrue) {
            return 50;
        } else if(countFalse > countTrue) {
            percent -=countTrue * 10;
        } else if(countFalse < countTrue) {
            percent -=countFalse *10;
        }
        return percent;
    }



}
