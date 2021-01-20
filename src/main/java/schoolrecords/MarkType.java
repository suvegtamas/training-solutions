package schoolrecords;

public enum MarkType {
    A(5, "excellent"), B(4, "very good"),
    C(3, "improvement neeeded"), D(2, "close fail"), F(1, "fail");

    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    MarkType(int value, String description) {
        this.value = value;
        this.description = description;
    }
}
