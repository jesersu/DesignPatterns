package AbstractFactory.ConcreteLinux;

import AbstractFactory.Product.Button;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.print("render Linux Button");
    }

    @Override
    public void onClick() {
        System.out.print("ONclick Linux BUTTON");
    }
}
