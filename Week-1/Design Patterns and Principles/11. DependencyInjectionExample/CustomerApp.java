public class CustomerApp {
    public static void main(String[] args) {
        // Injecting repository into service
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);

        // Using the service
        service.getCustomerDetails("C123");
    }
}
