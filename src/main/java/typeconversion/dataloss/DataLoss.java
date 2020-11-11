package typeconversion.dataloss;

public class DataLoss {

    public static final int MAX_NUMBER_OF_LOSS = 3;


    public void dataLoss() {
        long number = 0;
        for (long i = 0; i < MAX_NUMBER_OF_LOSS;) {
            long convert = (long) (float) number;
            if (convert != number) {
                System.out.println("Number: " + " " + number + " in binary: " + Long.toBinaryString(number));
                System.out.println("Converted: " + " " + convert + " in binary: " + Long.toBinaryString(convert));
                i++;
            }
            number++;
        }
    }

    public static void main(String[] args) {
        DataLoss data = new DataLoss();
        data.dataLoss();
    }
}