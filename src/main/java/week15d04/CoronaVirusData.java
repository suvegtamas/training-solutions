package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CoronaVirusData {
    private List<Cases> caseList = new ArrayList<>();

    public List<String> threeMostCases(BufferedReader reader) throws IOException{
        List<String> result = new ArrayList<>();
        String line;
        while((line= reader.readLine()) != null) {
            if(line.contains("Hungary")) {
                addToList(line);
            }
        }
        Collections.sort(caseList,new ByCasesComparator());
        for(int i = 0; i < 3;i++) {
            result.add(caseList.get(i).getWeek());
        }
    return result;
    }

    public void addToList(String line) {
        String[] parts = line.split(",");
        String week = parts[1];
        int cases = Integer.parseInt(parts[2]);
        caseList.add(new Cases(week,cases));
    }

    public static void main(String[] args) {
        CoronaVirusData cvd = new CoronaVirusData();
        try(BufferedReader br = Files.newBufferedReader(Path.of("src/main/resources/data .csv"))) {
            List<String> result = cvd.threeMostCases(br);
            System.out.println(result);
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }
}
