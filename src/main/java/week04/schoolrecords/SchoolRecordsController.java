package week04.schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class SchoolRecordsController {
    private List<Subject> subjectList = new ArrayList<>();
    private List<Tutor> tutorList = new ArrayList<>();
    private final String MENU = "1. Diákok nevének listázása\n" +
            "2. Diák név alapján keresése\n" +
            "3. Diák létrehozása\n" +
            "4. Diák név alapján törlése\n" +
            "5. Diák feleltetése\n" +
            "6. Osztályátlag kiszámolása\n" +
            "7. Tantárgyi átlag kiszámolása\n" +
            "8. Diákok átlagának megjelenítése\n" +
            "9. Diák átlagának kiírása\n" +
            "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
            "11. Kilépés";
    private ClassRecords classRecords;

    public void initSchool() {

    }

    public static void main(String[] args) {

    }
}
