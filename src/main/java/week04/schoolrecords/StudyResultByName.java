package week04.schoolrecords;

public class StudyResultByName {
    private String studentName;
    private double studyAverage;

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }

    public StudyResultByName(double studyAverage, String studentName) {
        this.studyAverage = studyAverage;
        this.studentName = studentName;
    }
}
