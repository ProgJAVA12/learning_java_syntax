import java.util.Scanner;

public class learning_while_for {

    public static void main(String[] args){

        int maximum = Integer.MIN_VALUE;
        int max;

        // Нахождение максимального введеного пользователем числа через цикл while()

        Scanner sc = new Scanner(System.in);
        System.out.println("Цикл while() : ");
        while (sc.hasNextInt())
        {
            int xx = sc.nextInt();
            maximum = xx > maximum ? xx : maximum;
        }
        System.out.println(maximum);

        // Нахождение максимального введенного пользователем числа через цикл for()

        Scanner scanner = new Scanner(System.in);
        System.out.println("Цикл for() : ");
        for( max = Integer.MIN_VALUE;scanner.hasNextInt();)
        {
           int x = scanner.nextInt();
           max = x > max ? x : max;
        }
        System.out.println(max);
    }
}
