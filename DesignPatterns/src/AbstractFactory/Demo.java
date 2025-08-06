package AbstractFactory;

import AbstractFactory.AbstractFactory.GUIFactory;
import AbstractFactory.ConcreteFactory.LinuxFactory;
import AbstractFactory.ConcreteFactory.MacOSFactory;
import AbstractFactory.ConcreteFactory.WindowsFactory;

public class Demo {
    private static ClientApplication configureApplication() {
        ClientApplication app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            factory = new WindowsFactory();
        } else if (osName.contains("mac")){
            factory = new MacOSFactory();
        } else {
            factory = new LinuxFactory();
        }

        app = new ClientApplication(factory);
        return app;
    }

    public static void main(String[] args) {
        ClientApplication app = configureApplication();
        app.renderUI();
        System.out.println("---");
        app.interact();
    }
}