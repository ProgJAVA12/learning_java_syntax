import java.util.Arrays;

import static java.util.Arrays.mismatch;


public class learning_arrays3 {

    static void main() {
        int a[] = {3,4,5,6};
        int b[] = {3,4,5};

       Arrays.sort(a);
       Arrays.sort(b);
        System.out.println(mismatch(a , b));
    }
}
