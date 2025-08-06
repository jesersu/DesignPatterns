package AbstractFactory.ConcreteProduct.ConcreteLinux;

import AbstractFactory.Product.CheckBox;

public class LinuxCheckbox implements CheckBox {
    @Override
    public void render() {
        System.out.print("Linux render checkbox");
    }

    @Override
    public void onCheck() {
        System.out.print("Linux oncheck checkbox");
    }
}
