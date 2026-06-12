

public class learning_arrays_3 {

    static void main(){

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <=7; j++) {
                if(j > i && j<(7-i)){
                    System.out.print(" ");
                }
                else {
                    System.out.print("k");
                }

            }
            System.out.println();
        }

    }
}





