package AbstractFactory.ConcreteProductMac;

import AbstractFactory.Product.CheckBox;

// Concrete Product B2
public class MacOSCheckbox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Rendering a macOS-style checkbox");
    }

    @Override
    public void onCheck() {
        System.out.println("macOS checkbox toggled!");
    }
}