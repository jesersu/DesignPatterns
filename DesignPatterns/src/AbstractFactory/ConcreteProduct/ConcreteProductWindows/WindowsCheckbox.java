package AbstractFactory.ConcreteProduct.ConcreteProductWindows;

import AbstractFactory.Product.CheckBox;

public class WindowsCheckbox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Rendering a Windows-style checkbox");
    }

    @Override
    public void onCheck() {
        System.out.println("Windows checkbox toggled!");
    }
}