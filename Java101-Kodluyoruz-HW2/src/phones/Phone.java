package phones;

public abstract class Phone {
    private String modelName;
    private String imeiNumber;
    private String versionNumber;
    private double memoryCapacity;
    private double screenSize;
    private String keyboardType;

    public Phone(String modelName, String imeiNumber, String versionNumber, double memoryCapacity, double screenSize) {
        this.modelName = modelName;
        this.imeiNumber = imeiNumber;
        this.versionNumber = versionNumber;
        this.memoryCapacity = memoryCapacity;
        this.screenSize = screenSize;

    }

    //Her iki marka telefonda ollan ortak davranışlar
    public abstract void call();
    public abstract void message();

    //private özelliklere diğer yerlerden erişmek için getter setter fonksiyonları oluşturalım;
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(String imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public double getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(double memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void showInfos() {
        System.out.println("Model Name: " + getModelName() + "\nIMEI Number: " + getImeiNumber() +
                "\nVersion Number: " + getVersionNumber() + "\nMemory Capacity: " + getMemoryCapacity() +
                "\nScreen Size: " + getScreenSize());
    }
}
