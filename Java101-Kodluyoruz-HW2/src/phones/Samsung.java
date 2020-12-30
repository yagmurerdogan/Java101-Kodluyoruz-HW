package phones;

import interfaces.ISamsung;

public class Samsung extends Phone implements ISamsung {
    public PushButtonKeyboard keyboard = new PushButtonKeyboard();

    public Samsung(String modelName, String imeiNumber, String versionNumber, double memoryCapacity, double screenSize) {
        super(modelName, imeiNumber, versionNumber, memoryCapacity, screenSize);
    }
    @Override
    public void call() {
        System.out.println("You can call with Samsung");
    }

    @Override
    public void message() {
        System.out.println("You can send message with Samsung");
    }

    @Override
    public void shareFile() {
        System.out.println("You can share file with Samsung");
    }

    @Override
    public void listenMp3() {
        System.out.println("You can listen MP3 with Samsung");
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println("Keyboard Type: " + keyboard.showKeyboardType());
    }
}

