import java.util.Scanner;

public class learning_boolean {

    public static void main (String[] args){

        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        int b = console.nextInt();

        if ((a + b) >= 10)
            System.out.println("10");
           if ((a  == 5 && b == 5 ))
               System.out.println("5 5");
           else
               System.out.println("не 5 5");
        if ((a + b) <10)
            System.out.println("не 10");

    }
}
