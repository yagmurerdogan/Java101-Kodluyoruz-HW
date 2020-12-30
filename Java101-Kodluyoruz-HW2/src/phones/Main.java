package phones;

public class Main {
    public static void main(String[] args) { //2gb,16gb
        Samsung samsung = new Samsung("Samsung E250","imei123",
                "version1", 2048, 2.0);

        samsung.showInfos();
        System.out.println("↓ ↓ ↓ ↓ ↓ ↓ Specifications ↓ ↓ ↓ ↓ ↓ ↓");
        samsung.call();
        samsung.message();
        samsung.shareFile();
        samsung.listenMp3();

        System.out.println("♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥");

        Apple apple = new Apple("iPhone 5s","imei456",
                "version2",16384,4.0);

        apple.showInfos();
        System.out.println("↓ ↓ ↓ ↓ ↓ ↓ Specifications ↓ ↓ ↓ ↓ ↓ ↓");
        apple.call();
        apple.message();
        apple.shareScreen();
        apple.videoCall();
    }
}
