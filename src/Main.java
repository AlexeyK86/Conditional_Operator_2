public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int clientOS = 0;
        switch (clientOS) {
            case 0:
            System.out.println("Установите версию приложения для iOS по ссылке");
            break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такой операционной системы не существует");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int clientOS = 1;
        int clientDeviceYear = 2014;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015)
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                else System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                if (clientDeviceYear < 2015)
                     System.out.println("Установите облегченную версию приложения для Android по ссылке");
                else System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такой операционной системы не существует");
        }
    }

        public static void task3 () {
            System.out.println("Задача 3");
            // Пишем код для задачи 3
            int year = 2024;
            if ((year % 4 == 0) && year % 100 != 0)
            {
                System.out.println(year + " год является високосным.");
            }
            else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
            {
                System.out.println(year + " год является високосным.");
            }
            else
            {
                System.out.println(year + " год не является високосным.");
            }
        }
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 день");
        }
        else if (deliveryDistance > 20 && deliveryDistance < 60) {
                System.out.println("Потребуется дней: 2 дня");
            }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3 дня");
        }
        else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber +" месяц принадлежит к сезону зима");
                break;
            case 2:
                System.out.println(monthNumber +" месяц принадлежит к сезону зима");
                break;
            case 3:
                 System.out.println(monthNumber +" месяц принадлежит к сезону весна");
                 break;
            case 4:
                System.out.println(monthNumber +" месяц принадлежит к сезону весна");
                break;
            case 5:
                System.out.println(monthNumber +" месяц принадлежит к сезону весна");
                break;
            case 6:
                System.out.println(monthNumber +" месяц принадлежит к сезону лето");
                break;
            case 7:
                System.out.println(monthNumber +" месяц принадлежит к сезону лето");
                break;
            case 8:
                System.out.println(monthNumber +" месяц принадлежит к сезону лето");
                break;
            case 9:
                System.out.println(monthNumber +" месяц принадлежит к сезону осень");
                break;
            case 10:
                System.out.println(monthNumber +" месяц принадлежит к сезону осень");
                break;
            case 11:
                System.out.println(monthNumber +" месяц принадлежит к сезону осень");
                break;
            case 12:
                System.out.println(monthNumber +" месяц принадлежит к сезону зима");
                break;
            default:
                System.out.println(monthNumber +" месяца не существует");
        }
    }
}
