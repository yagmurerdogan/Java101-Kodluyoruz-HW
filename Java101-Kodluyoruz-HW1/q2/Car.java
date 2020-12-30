package q2;

public class Car {
    private String marka;
    private String model;
    private String renk;
    private int sene;
    private int km;

    public Car() {

    }

    public Car(String marka, String model, String renk, int sene, int km) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.sene = sene;
        this.km = km;
    }

    //private olan özelliklere başka sınıflardan erişebilmek için getter ve setter kullanırız.
    //getter metodu içine parametre almazken, setter metodu parametre alır.


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getSene() {
        return sene;
    }

    public void setSene(int sene) {
        this.sene = sene;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "----- Arabanın Özellikleri -----" + "\nMarka : " + marka + "\nModel : " + model +
                "\nRenk : " + renk + "\nSene : " + sene + "\nKm : " + km ;
    }
}
