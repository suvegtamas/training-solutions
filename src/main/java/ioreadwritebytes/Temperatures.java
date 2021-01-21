package ioreadwritebytes;

public class Temperatures {
    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        double avg = 0;
        for(byte b : data) {
            avg += b;
        }
        return avg / 365;
    }
    public double getMonthAverage() {
        double avg = 0;
        for (int i=data.length - 1; i > data.length - 31; i--) {
            avg += data[i];
        }
        return avg / 30;
    }
}
