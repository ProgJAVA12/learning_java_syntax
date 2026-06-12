import java.util.Random;

public class learning_random {

    static void main() {
        Random random = new Random();
        for (int i = 0; i < 5 ; i++) {
           for (int j = 0; j < 5; j++) {
            boolean x = random.nextBoolean();
            System.out.print(x + " " + "\t" );
        }
            System.out.println();
        }
    }
    
}
