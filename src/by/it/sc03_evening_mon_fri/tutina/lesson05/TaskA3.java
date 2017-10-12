package by.it.sc03_evening_mon_fri.tutina.lesson05;
/*
Существует ли пара?
Ввести с клавиатуры три целых числа.
Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.

Пример для чисел 1 2 2:
2 2

Пример для чисел 2 2 2:
2 2 2

 */


import java.util.Scanner;

class TaskA3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int i=sc.nextInt();
        int s=sc.nextInt();
        int p=sc.nextInt();
        if (i==s && s==p && p==i) System.out.println(i+" "+s+" "+p);
        else {
            if (i==s || s==p)  System.out.println(s+" "+s);
            if (i==p) System.out.println(i+" "+i);
        }
    }
}