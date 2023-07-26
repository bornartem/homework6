import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // Задача 1
            System.out.println("i = " + i);
        }
        for (int i = 10; i > -11; i = i - 1) { // Задача 4
            System.out.println("i = " + i);
        }
        for (int i = 2; i <= 17; i = i + 2) { // Задача 3
            System.out.println("i = " + i);
        }
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println("i = " + i); // Задача 2
        }
        for (int i = 1904; i <= 2096; i = i + 4) { // Задача 5
            System.out.println(i + " год является високосным");
        }
        for (int i = 7; i <= 98; i+= 7) { // Задача 6
            System.out.println(i);
        }
        for (int i =1; i<513; i*=2) { // Задача 7
        System.out.println(i);
        }
        int money =29000; //Задача 8
        int total =0;
        for (int i=0; i<12; i++) {
            total = total + money;
            System.out.println("Месяц " + i + " сумма накоплений равна" + total + " рублей");
        }
            int money1 = 29000; //Задача 9
            int total2 = 0;
            for (int i = 0; i < 12; i++) {
                total2=total2+total2/100;
                total2 = total2 + money1;
                System.out.println("Месяц " + i + " сумма накоплений равна" + total2 + " рублей");
            }
            int number =2; //Задача 10
            int cycle =1;
        for (int i=1; i<11; i=i+1) {
            cycle = number*i;
            System.out.println(number+ " * " + i+ " = " + cycle);
        }
    }
}