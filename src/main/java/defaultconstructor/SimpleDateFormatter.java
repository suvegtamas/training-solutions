package defaultconstructor;

public class SimpleDateFormatter {

    private CountryCode defaultCountry;

    public SimpleDateFormatter() {
         this.defaultCountry = CountryCode.HU;

    }
   public String formatDateString(SimpleDate simpleDate) {
        return formatDateStringByCountryCode(defaultCountry,simpleDate);
   }
   public String formatDateStringByCountryCode(CountryCode countryCode,SimpleDate simpleDate) {
        String result = "";
        switch (countryCode) {
            case HU:
                result = simpleDate.getYear() + "-" + simpleDate.getMonth() + "-" + simpleDate.getDay();
                break;
            case EN:
                result = simpleDate.getDay() + "-" + simpleDate.getMonth() + "-" + simpleDate.getYear();
                break;
            case US:
                result =  simpleDate.getMonth() + "-"+ simpleDate.getDay() + "-" + simpleDate.getYear();
            default:
                throw new IllegalArgumentException("No such format");
        }
        return result;
   }

}
