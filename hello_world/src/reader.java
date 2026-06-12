import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reader {

    public static void main(String [] args) throws IOException {
        String name ;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите ваше имя: ");
        name = reader.readLine();


        System.out.println(name);
    }
    }

