import java.util.Scanner;

public class String_equals {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a = "Хорошо";
        String b = "хорошо";

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));

        String result = a.equals(b) ? "Равны": "НЕ равны";
        String resultat = a.equalsIgnoreCase(b) ? "Равны" : "Не равны";

        System.out.println("Сравнение строк методом equals() : " + result);
        System.out.println("Сравнение строк методом equalsIgnoreCase() : " + resultat);

        // разные переменные с одинаковыми значениями строк

        String message = "Этот код будет работать";
        String text = "Этот код будет работать";

        // Здесь мы сравниваем ссылку на обьект и получаем true так как ссылка одна

        System.out.println(message == text);

        // Разные переменные с разными ссылками на обьект но значение одинаковое

        String name = "Алеша";
        String surname = new String("Алеша");

        // Здесь будет false
        System.out.println(name == surname);
    }
}
