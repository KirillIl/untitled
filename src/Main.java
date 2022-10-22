public class Main {
    public static void printSeparator () {
        System.out.println("＼(￣▽￣)／");

    }
    public static void determineLapYear (int year) {
        if (year % 4 != 0 || year % 100 == 0 && year % 400 !=0) {
            System.out.println("обычный год");
        } else {
            System.out.println("високосный");
        }
    }
    public static void getClientOS (int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void calculateDistance (int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + "1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + "2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + "3");
        } else {
            System.out.println("Потребуется дней: " + "более 3");
        }
    }

    public static void main(String[] args) {
        printSeparator ();
        determineLapYear(2000);
        printSeparator();
        getClientOS (0, 2014);
        printSeparator();
        calculateDistance (95);
        printSeparator();
    }
}
