package by.it.sc02_morning.serzhan.lesson05;

/*
Выведите на экран в цикле 10 раз фразу
Я изучаю программирование.

при  выводе сделайте такое разветвление в теле цикла,
чтобы вместо 3-й и 9-й по счету фраз выводилась фраза
Меня интересует высокая зарплата!

Должнен получиться следующий вывод строк:

Я изучаю программирование.
Я изучаю программирование.
Меня интересует высокая зарплата!
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Меня интересует высокая зарплата!
Я изучаю программирование.



 */
public class TaskA1 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++)
        switch(i) {
            case 0:
                System.out.println("Я изучаю программирование.");
                break;
            case 1:
                System.out.println("Я изучаю программирование.");
                break;
            case 2:
                System.out.println("Меня интересует высокая зарплата!");
                break;
            case 3:
                System.out.println("Я изучаю программирование.");
                break;
            case 4:
                System.out.println("Я изучаю программирование.");
                break;
            case 5:
                System.out.println("Я изучаю программирование.");
                break;
            case 6:
                System.out.println("Я изучаю программирование.");
                break;
            case 7:
                System.out.println("Я изучаю программирование.");
                break;
            case 8:
                System.out.println("Меня интересует высокая зарплата!");
                break;
                default:
            System.out.println("Я изучаю программирование.");
        }
    }
}
