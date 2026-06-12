import java.util.Scanner;

public class learning_for {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for(int i = 0;i < 10;i++)
        {

            if(scanner.hasNextInt())
                count++;
            scanner.nextLine();

        }
        System.out.println("Количество введеных чисел : " + "[" + count + "]");
    }
}
