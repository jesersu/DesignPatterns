package AbstractFactory.ConcreteFactory;

import AbstractFactory.AbstractFactory.GUIFactory;
import AbstractFactory.ConcreteProductMac.MacOSButton;
import AbstractFactory.ConcreteProductMac.MacOSCheckbox;
import AbstractFactory.Product.Button;
import AbstractFactory.Product.CheckBox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckbox();
    }
}