package iostringwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {

    public void wordsLength(Writer writer,List<String> words) {

        try (writer){
            for(String s : words) {
                writer.write(s + " " + countLetters(s) +"\n");
            }
        }
        catch (IOException e) {
            throw new IllegalStateException("Can't write in memory!", e);
        }

    }
    public int countLetters(String input) {
        int count = 0;
        for(char c : input.toCharArray()) {
            count++;
        }
        return count;
    }

    public String writeWithStringWriter(List<String> input) {
        StringWriter stringWriter = new StringWriter();
        wordsLength(stringWriter,input);
        return stringWriter.toString();
    }

    public static void main(String[] args) {
        LongWordService lws = new LongWordService();
        lws.writeWithStringWriter(List.of("Pseudopseudohypoparathyroidism",
                "Supercalifragilisticexpialidocious",
                "Strengths"));
    }
}
