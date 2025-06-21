public class FinancialForecast {

    
    public static double calculateFutureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }

        return calculateFutureValue(presentValue * (1 + rate), rate, years - 1);
    }
}
