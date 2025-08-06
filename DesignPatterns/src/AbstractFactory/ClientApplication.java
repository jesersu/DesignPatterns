package AbstractFactory;

import AbstractFactory.AbstractFactory.GUIFactory;
import AbstractFactory.Product.Button;
import AbstractFactory.Product.CheckBox;

public class ClientApplication {
    private Button button;
    private CheckBox checkbox;

    public ClientApplication(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }

    public void interact() {
        button.onClick();
        checkbox.onCheck();
    }
}
