import java.util.Scanner;

public class about_switch {

    static void main() {

        Scanner cs = new Scanner(System.in);
        String text = "";
        switch (cs.nextInt()){
            case 1,3,5 -> text = menu();
          //  case 
        }
        System.out.println(text);
    }

    public static String menu(){

        return "0.меню\n" + "1.собака";
    }
}
