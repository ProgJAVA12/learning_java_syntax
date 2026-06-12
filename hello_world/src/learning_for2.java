public class learning_for2 {

    public static void main(String[] args){

            for (int i = 0; i < 10; i++) {
                // int starCount = 10 - i;
                for(int k = 0; k < 3; k++) {
                    for (int j = 0; j < 20; j++) {
                        if (j > (9 - i) && j < (10 + i))
                            System.out.print(" ");
                        else {
                            System.out.print("*");
                        }
                    }
                    System.out.print(' ');
                }
                System.out.println();
            }



    }
}
