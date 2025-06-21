public class ForecastDemo {
    public static void main(String[] args) {
        double presentValue = 10000.0; // ₹10,000
        double growthRate = 0.08;      // 8% annual growth
        int years = 5;                 // Forecast for 5 years

        double futureValue = FinancialForecast.calculateFutureValue(presentValue, growthRate, years);

        System.out.printf("Future value after %d years: ₹%.2f\n", years, futureValue);
    }
}
