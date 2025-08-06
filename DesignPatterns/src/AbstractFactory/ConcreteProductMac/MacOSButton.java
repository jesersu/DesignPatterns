package AbstractFactory.ConcreteProductMac;
import AbstractFactory.Product.Button;
public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a macOS-style button");
    }

    @Override
    public void onClick() {
        System.out.println("macOS button clicked!");
    }
}