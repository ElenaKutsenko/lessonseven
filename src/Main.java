import java.time.LocalDate;

public class Main {

    public static void year(int year) {

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + "-не високосный год");
        } else if (year % 4 == 0 && year % 100 > 0)
            System.out.println(year + "-високосный год");
        else if (year % 100 == 0)
            System.out.println(year + "-високосный год");
        else
            System.out.println(year + "-не високосный год");
    }

    public static void bank(int clientOS, int currentYear, int clientDeviceYear) {
    if (clientOS == 0) {
    System.out.println("«Установите версию приложения для iOS по ссылке».");
    if (clientDeviceYear < currentYear)
    System.out.println("«Установите версию приложения для Android по ссылке».");
        } else if (clientOS == 1) {
    System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
    if (clientDeviceYear < currentYear)
    System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
    }}


    public static void str(String stroka) {
    char[] a = stroka.toCharArray();
    for (char i = 0; i < stroka.length(); i++) {
    for (char j = (char) (i + 1); j < stroka.length(); j++) {
    if (a[i] == a[j]) {
    System.out.println("Найден дубль " + a[j]);
    return;
    }}}}


    public static void delivery(int deliveryDistance) {

        if (deliveryDistance <= 20)
            System.out.println("Потребуется дней: 1");
        if (deliveryDistance > 20 && deliveryDistance < 60)
            System.out.println("Потребуется дней: 2");
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3 ");
        }
    }

    public static void main(String[] args) {

        int a = 2021;
        year(a);
        int b = 2022;
        year(b);
        int c = 2023;
        year(c);
        int d = 2024;
        year(d);

        int i = 1, x = 2015;
        int v = LocalDate.now().getYear();
        bank(i, x, v);

        int deliveryDistance = 95;
        delivery(deliveryDistance);

        str("aabccddefgghiijjkk");

    }

}

