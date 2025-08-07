package Builder.InnerClass;
public class ComputerShop {
    public static void main(String[] args) {
        // Building a basic computer
        Computer basicComputer = new Computer.ComputerBuilder("Intel i5", "8GB DDR4")
                .build();

        System.out.println("Basic Computer:");
        System.out.println(basicComputer);
        System.out.println();

        // Building a gaming computer
        Computer gamingComputer = new Computer.ComputerBuilder("AMD Ryzen 9", "32GB DDR4")
                .withStorage("1TB NVMe SSD")
                .withGraphicsCard("NVIDIA RTX 3080")
                .withOperatingSystem("Windows 11 Pro")
                .withBluetooth(true)
                .withWiFi(true)
                .build();

        System.out.println("Gaming Computer:");
        System.out.println(gamingComputer);
        System.out.println();

        // Building a developer computer
        Computer devComputer = new Computer.ComputerBuilder("Apple M1 Max", "64GB Unified")
                .withStorage("2TB SSD")
                .withOperatingSystem("macOS Monterey")
                .withWiFi(true)
                .build();

        System.out.println("Developer Computer:");
        System.out.println(devComputer);
    }
}