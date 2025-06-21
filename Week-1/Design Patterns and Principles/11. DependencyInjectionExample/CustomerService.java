public class CustomerService {
    private final CustomerRepository repository;

    // Constructor-based Dependency Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void getCustomerDetails(String id) {
        String customer = repository.findCustomerById(id);
        System.out.println("Retrieved: " + customer);
    }
}
