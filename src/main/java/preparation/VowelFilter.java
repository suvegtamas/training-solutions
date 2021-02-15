package preparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VowelFilter {
    public String filterVowels(BufferedReader reader) throws IOException {
       StringBuilder sb = new StringBuilder();
       String line;
       while((line=reader.readLine()) != null) {
           processLine(sb, line);
       }
       return sb.toString();
   }

    private void processLine(StringBuilder sb, String line) {
        String result =  line.replaceAll("[\"aAáÁeEéÉiIíÍoOóÓöÖőŐuUúÚüÜűŰ\"]", "");
        sb.append(result).append("\n");
    }


    public static void main(String[] args) {

    }
}

/*   ## Magánhangzók
Írj egy VowelFilter.filterFowels(BufferedReader reader) metódust, mely beolvas egy
fájlt soronként, kiszűri belőle a magánhangzókat, és visszaadja egy String-ként.
Tehát a bemeneti fájl tartalma:
Aprócska
Kalapocska
Benne
Csacska
Macska
Mocska
Kimenet Stringként:
prcsk
Klpcsk
Bnn
Cscsk
Mcsk
Mcsk*/