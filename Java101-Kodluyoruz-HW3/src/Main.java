import java.util.*;  //ctrl alt l girintileri düzenliyor
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5); //havuz oluşturduk en fazla 5 thread açılır.

        Map<String, City> cityMap = new HashMap<>();  //key string value da city ,  isim küçük başlıyor

        City london = new London();
        cityMap.put(london.getCountryCode(), london);

        City berlin = new Berlin();
        cityMap.put(berlin.getCountryCode(), berlin);

        City moscow = new Moscow();
        cityMap.put(moscow.getCountryCode(), moscow);

        City newdelhi = new NewDelhi();
        cityMap.put(newdelhi.getCountryCode(), newdelhi);

        City newyork = new Newyork();
        cityMap.put(newyork.getCountryCode(), newyork);

        // şu an amacımız map i sıralamak, sıralamak için comparable lazım ve bunun için mapi listeye çevirmek lazım

        List<City> cityList = new ArrayList<>(cityMap.values()); //cityleri citymapte tutuyoruz.

        Collections.sort(cityList);
        for (City donen : cityList) {
            System.out.println("Şehir Kodu : " + donen.getCountryCode() + " Şehir İsmi : " + donen.getName()); //sıralandı ve for each ile liste içi döndürüldü
        }

        Boolean yamur = true;
        while (yamur) {
            System.out.println("Saatini öğrenmek istediğiniz en az 3 en fazla 5 şehrin şehir kodunu araya - koyarak yazınız. Örnek ( BER-MOW-DEL) ☀ ");
            String choices = scanner.nextLine().toUpperCase(); //girilen değerleri büyük yazmak için touppercase kullandık
            //cevapları listede tutmak lazım
            List<String> choicesList = Arrays.asList(choices.split("-")); //güzel araştır

            if (choicesList.size() >= 3 && choicesList.size() <= 5) {
                try {
                    for (String ch : choicesList) {
                        if (City.getCodeList().contains(ch)) {
                            continue;
                        } else { //kendimiz hata oluşturuyoruz.
                            throw new MyException();
                        }
                    }
                    for (String ye : choicesList) {
                        switch (ye) {
                            case "MOW" :
                                executorService.execute(new ThreadClass(moscow));
                                break;
                            case "BER" :
                                executorService.execute(new ThreadClass(berlin));
                                break;
                            case "LON" :
                                executorService.execute(new ThreadClass(london));
                                break;
                            case "DEL" :
                                executorService.execute(new ThreadClass(newdelhi));
                                break;
                            case "NYC" :
                                executorService.execute(new ThreadClass(newyork));
                                break;

                        }
                    }
                    break;
                } catch (MyException exc) {
                    exc.MyException();
                }
            } else {
                System.out.println("Lütfen 3 ile 5 arasında şehir kodu yazınız.");
            }

        }
    }
}
