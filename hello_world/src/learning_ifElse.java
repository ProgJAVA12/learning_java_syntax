import java.util.Scanner;

public class learning_ifElse {

    public static void main (String[] args){
        // Создание обьекта сканер для считывания данных с клавиатуры
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        // Тернарный оператор. Нахождение меньшего числа
        int min = a < b ? a : b;
        // Тернарный оператор. Нахождение большего числа
        int max = a > b ? a : b;

        if (min == max)
            System.out.println("Числа равны!");
        else
            System.out.println("Наименьшее число : " + "[" + min + "]\n" + "Наибольшее число : " + "[" + max + "]");

        //Тернарный оператор. нахождение максимального числа


    }
}
