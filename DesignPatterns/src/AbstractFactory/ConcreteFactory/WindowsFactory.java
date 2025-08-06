package AbstractFactory.ConcreteFactory;

import AbstractFactory.AbstractFactory.GUIFactory;
import AbstractFactory.ConcreteProductWindows.WindowsButton;
import AbstractFactory.ConcreteProductWindows.WindowsCheckbox;
import AbstractFactory.Product.Button;
import AbstractFactory.Product.CheckBox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckbox();
    }
}
