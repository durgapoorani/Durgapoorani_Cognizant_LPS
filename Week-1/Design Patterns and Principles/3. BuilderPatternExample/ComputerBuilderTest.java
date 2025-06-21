public class ComputerBuilderTest {
    public static void main(String[] args) {
        // Basic configuration
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();

        System.out.println("Basic Configuration:");
        basicComputer.displayConfiguration();

        System.out.println("\n-----------------------------\n");

        // High-end configuration
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .build();

        System.out.println("High-End Configuration:");
        gamingComputer.displayConfiguration();
    }
}
