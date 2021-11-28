package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int clientOS = 0;
        int clientAndroid = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (clientAndroid == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientDeviceYear = 2010;
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите  приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

            int year = 2005;
            if (year % 4 == 0)  {
                System.out.println("Год являеться високосным");
                if ((year % 100 != 0) || (year % 400 == 0));
            } else {
                System.out.println("Год не являеться високосным");
            }



            int deliveryDistance = 50;
            if (deliveryDistance <=20){
                System.out.println("Доставка займет 1 сутки");
            }else if (deliveryDistance >=20 && deliveryDistance <=60){
                System.out.println("Доставка займет 2 суток");
            }else if ((deliveryDistance >=60) && (deliveryDistance <=100)){
            System.out.println("Доставка займет 3 суток");
        }


            int monthNumber = 11;
            switch (monthNumber){
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                case 12:
                    System.out.println("Зима");
                    break;
                default:
                    System.out.println("Такого месяца не существует");

            }




        }
    }
