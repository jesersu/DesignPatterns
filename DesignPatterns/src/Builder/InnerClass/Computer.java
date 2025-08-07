package Builder.InnerClass;

public class Computer {
    // Required parameters
    private final String CPU;
    private final String RAM;

    // Optional parameters
    private final String storage;
    private final String graphicsCard;
    private final String operatingSystem;
    private final boolean hasBluetooth;
    private final boolean hasWiFi;

    // Private constructor (only Builder can create instances)
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
        this.hasBluetooth = builder.hasBluetooth;
        this.hasWiFi = builder.hasWiFi;
    }

    // Getters (no setters to maintain immutability)
    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public String getGraphicsCard() { return graphicsCard; }
    public String getOperatingSystem() { return operatingSystem; }
    public boolean hasBluetooth() { return hasBluetooth; }
    public boolean hasWiFi() { return hasWiFi; }

    @Override
    public String toString() {
        return "Computer Configuration:\n" +
                "CPU: " + CPU + "\n" +
                "RAM: " + RAM + "\n" +
                "Storage: " + (storage != null ? storage : "Not specified") + "\n" +
                "Graphics Card: " + (graphicsCard != null ? graphicsCard : "Integrated") + "\n" +
                "OS: " + (operatingSystem != null ? operatingSystem : "None") + "\n" +
                "Bluetooth: " + (hasBluetooth ? "Yes" : "No") + "\n" +
                "WiFi: " + (hasWiFi ? "Yes" : "No");
    }

    // Builder class
    public static class ComputerBuilder {
        // Required parameters
        private final String CPU;
        private final String RAM;

        // Optional parameters - initialized to default values
        private String storage = null;
        private String graphicsCard = null;
        private String operatingSystem = null;
        private boolean hasBluetooth = false;
        private boolean hasWiFi = false;

        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public ComputerBuilder withStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder withGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder withOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public ComputerBuilder withBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public ComputerBuilder withWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}