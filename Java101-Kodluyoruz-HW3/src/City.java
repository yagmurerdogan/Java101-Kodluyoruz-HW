import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public abstract class City implements IClock, Comparable<City> { //comparable city objesinde veri alacak ve sıralayacak

    @Override
    public int compareTo(City o) {
        return this.getName().compareTo(o.getName());
    }

    private String name;
    private String countryCode;
    private String gmt;
    private static List<String> codeList = new ArrayList<>();

    //getter setter


    public static List<String> getCodeList() {
        return codeList;
    }

    public static void setCodeList(String code) {
    codeList.add(code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getGmt() {
        return gmt;
    }

    public void setGmt(String gmt) {
        this.gmt = gmt;
    }

    @Override
    public void showTime() { //interface olduğu için
        Date time = new Date(); //zaman objesi oluşturuldu
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss"); //saat dakika saniye
        timeFormat.setTimeZone(TimeZone.getTimeZone(gmt));
        System.out.println("Şehir : " + getName() + " Saat : " + timeFormat.format(time));
    }
}
