//package staticattrmeth;
//
//import java.math.BigDecimal;
//
//public class BankTransaction {
//    private static final long MIN_TRX_VALUE = 1;
//    private static final long MAX_TRX_VALUE = 10_000_000;
//    private static long countTrx = 0;
//    private static BigDecimal sumOfTrx = new BigDecimal("0");
//    private static long currentMinValue = MAX_TRX_VALUE;
//    private static long currentMaxValue = MIN_TRX_VALUE;
//    private long trxValue;
//
//    public BankTransaction(long trxValue) {
//        this.trxValue = trxValue;
//        countTrx++;
//    }
//    public static void initTheDay() {
//        countTrx = 0;
//        sumOfTrx = new BigDecimal("0");
//        currentMinValue = MAX_TRX_VALUE;
//        currentMaxValue = MIN_TRX_VALUE;
//    }
//
//    public long getTrxValue() {
//        return trxValue;
//    }
//    public static BigDecimal averageOfTransaction() {
//        BigDecimal ifZero = new BigDecimal("0");
//        return countTrx == 0 ? ifZero :
//    }
//}
