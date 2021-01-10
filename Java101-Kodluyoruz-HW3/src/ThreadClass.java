public class ThreadClass implements Runnable {
private City city; //tipi ve değişken adı, city tipinde değişken oluşturdum.

    public ThreadClass(City city) {
        this.city = city;
    }

    @Override
    public void run() { //threadler 2 şekilde ayağa kaldırılabilir 1.start 2.executor
        city.showTime();
    }
}
