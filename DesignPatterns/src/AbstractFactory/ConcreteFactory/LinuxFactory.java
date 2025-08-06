package AbstractFactory.ConcreteFactory;

import AbstractFactory.AbstractFactory.GUIFactory;
import AbstractFactory.ConcreteProduct.ConcreteLinux.LinuxButton;
import AbstractFactory.ConcreteProduct.ConcreteLinux.LinuxCheckbox;
import AbstractFactory.Product.Button;
import AbstractFactory.Product.CheckBox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new LinuxCheckbox();
    }
}
