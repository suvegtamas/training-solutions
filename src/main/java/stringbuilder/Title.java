package stringbuilder;

public enum Title {
    MR("Mr."), MS("Ms."), DR("Dr."), PROF("Prof.");

    private String titleType;

    Title(String titleType) {
        this.titleType = titleType;
    }

    public String getTitleType() {
        return titleType;
    }
}
