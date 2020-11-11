package controlselection.week;

public class DayOfWeek {
    public String dayOfWeek(String day) {
        switch (day.toLowerCase()) {
            case "hétfő":
                day = "hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                day = "hét közepe";
                break;
            case "péntek":
                day = "majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                day = "hét vége";
                break;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
        return day;
    }
}
