public class StockMonitorTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileUser = new MobileApp("Durga");
        Observer webUser = new WebApp("InvestorX");

        market.registerObserver(mobileUser);
        market.registerObserver(webUser);

        System.out.println("Setting stock price to ₹1500.00");
        market.setStockPrice(1500.00);

        System.out.println("\nSetting stock price to ₹1530.25");
        market.setStockPrice(1530.25);

        market.removeObserver(webUser);

        System.out.println("\nSetting stock price to ₹1480.00");
        market.setStockPrice(1480.00);
    }
}
