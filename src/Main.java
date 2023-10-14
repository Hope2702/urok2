import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        /*5.27. Найти:
а) сумму всех целых чисел от 100 до 500;*/
      /*  int i = 1;
        int sum = 0;
        while (i <= 500) {

            sum += i;
            i++;
        }
        System.out.println(sum);

*//*сумму всех целых чисел от a до 500 (значение a вводится с клавиатуры;
a 500);*//*
        int i2 = 3;
        int sum1 = 0;
        while (i2 <= 500) {
            sum1 += i2;
            i2++;
        }
        System.out.println(sum1);*/

    /*произведение всех целых чисел от 8 до 15;*/
   /*  int i = 8;
     int pr = 1;
       while (i <= 15){

         pr *= i;
         i++;
     }
        System.out.println(pr);*/
  //напечатать полную таблицу сложения
   /*     int[][] a;
        a=new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print((i+1)+"+"+(j+1)+"="+((i+1)+(j+1)));
                System.out.print(" ");
            }
            System.out.println(" ");
        }*/
       //найти натуральное число из интервала от a до b с максимальной суммой делителей
      /*  int a = 5;
        int b = 50;

        int min = 0;
        int max = 0;

        for (int i = a; i <= b; i++) {
            int sum = 0;
            for (int j = 1; j * j <= i; j++)
            {if (i % j == 0) {
                sum += j;
                if (j != i / j) {
                    sum += i / j;
                    }
                }
            }
            if (sum > min) {
                min = sum;
                max = i;
            }
        }

        System.out.println(max);*/
       //дан массив. определить максимальный и минимальный  элемент
       /* int[] array = {8, 2, 1, 7, 3, 4, 5, 6, 9};

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(min);
        System.out.println(max);*/
        //насколько максимальный больше минимального


        /*int[] array = {8, 2, 1, 7, 3, 4, 5, 6, 9};

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
        int diff = max - min;
        System.out.println("diff " + diff);*/


        //индекс макс эл


       /* int[] arr = {20, -3, 5, 15, 7, 10, 4};
        int max = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);*/
        /*В массиве хранится информация о количестве страниц в каждой из
        100 книг. Все страницы имеют одинаковую толщину. Определить количество страниц в самой толстой книге.*/

        /*int[] str = new int[100];
        for (int i = 0; i < str.length; i++) {
            str[i] = i + 1;
        }
        int maxStr = str[0];

        for (int i = 1; i < str.length; i++) {
            if (str[i] > maxStr) {
                maxStr = str[i];

            }
        }

        System.out.print("Кол-во стр в самой толстой книге: " + maxStr);*/

        /*В массиве хранится информация о результатах 25 спортсменов, участвовавших в лыжной гонке. Определить результат спортсмена-победителя гонки */

        int[] results = new int[25];
        for (int i=0; i<results.length; ++i) {
            results[i] = i+1;
        }

        int winResult = results[0];
        int winPlace = 0;

        for (int res : results) {
            if (res < winResult) {
                winResult = res;
                int i;

            }
        }
        System.out.printf("Результат победителя: %d, место: %d", winResult, winPlace+1);
    }
}











