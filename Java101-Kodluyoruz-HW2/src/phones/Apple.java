package phones;

import interfaces.IApple;

public class Apple extends Phone implements IApple {
    public TouchScreenKeyboard keyboard = new TouchScreenKeyboard();

    public Apple(String modelName, String imeiNumber, String versionNumber, double memoryCapacity, double screenSize) {
        super(modelName, imeiNumber, versionNumber, memoryCapacity, screenSize);
    }

    @Override
    public void call() {
        System.out.println("You can call with Apple");
    }

    @Override
    public void message() {
        System.out.println("You can send message with Apple");
    }

    @Override
    public void videoCall() {
        System.out.println("You can have video call with Apple");
    }

    @Override
    public void shareScreen() {
        System.out.println("You can share screen with Apple");
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println("Keyboard Type: " + keyboard.showKeyboardType());
    }
}
