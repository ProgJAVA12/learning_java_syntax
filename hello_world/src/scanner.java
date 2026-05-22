import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        String name;
        int age;
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("Введите пожалуйста имя: ");
            if (console.hasNextInt()) {
                System.out.println("Ошибка! Попробуйте еще раз");
                console.nextLine();
            }
            else {
                name = console.nextLine();
                System.out.println("Спасибо, " + name.toUpperCase() + "\n" + "Пожалуйста укажите возраст: ");
                break;
            }
        }
        while (true) {
            if (console.hasNextInt()) {
                age = console.nextInt();
                System.out.println("Ваше имя: " +"[" + name.toUpperCase() +"]");
                System.out.println("Ваш возраст: " + "[" + age + "]");
                break;
            }
            else {
                System.out.println("Ошибка! Попробуйте еще раз");
                console.next();
            }


        }

        }




    }

