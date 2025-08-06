package AbstractFactory.AbstractFactory;

import AbstractFactory.Product.Button;
import AbstractFactory.Product.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}