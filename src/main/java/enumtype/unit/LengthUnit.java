package enumtype.unit;

public enum LengthUnit {
    METER(true,1000), MILLIMETER(true,1), CENTIMETER(true,100),
    YARD(false,914), FOOT(false, 304), INCH(false, 25);

    private final boolean isSiUnit;
    private final int inMillimeter;

    LengthUnit(boolean isSiUnit, int inMillimeter) {
        this.isSiUnit = isSiUnit;
        this.inMillimeter = inMillimeter;
    }

    public boolean isSiUnit() {
        return isSiUnit;
    }

    public int getInMillimeter() {
        return inMillimeter;
    }
}
