package covid;

import java.time.LocalDate;

public class Vaccination {
    private LocalDate date;
    private VaccinStatus status;
    private String note;
    private VaccinType type;

    public Vaccination(LocalDate date, VaccinStatus status, String note, VaccinType type) {
        this.date = date;
        this.status = status;
        this.note = note;
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public VaccinStatus getStatus() {
        return status;
    }

    public String getNote() {
        return note;
    }

    public VaccinType getType() {
        return type;
    }
}
