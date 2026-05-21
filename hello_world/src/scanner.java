import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Пожалуйста введите ваше имя :");
        if(console.hasNextInt()){
            System.out.println("Ошибка ! Пожалуйста введите имя");
        }
        else{
            String name = console.nextLine();
            System.out.println("Спасибо, " + name);
        }
        console.close();



    }
}
