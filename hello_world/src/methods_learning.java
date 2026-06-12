import java.sql.SQLOutput;
import java.util.Arrays;

public class methods_learning {

    public static void main(String[] args)
    {
     int[] array = new int[10];
     fillArray(array,99);

     System.out.println(Arrays.toString(array));
     arrayNumSum(array);

     int a = 5;
     int b = 1;

     int min = min(a,b);
        System.out.println(min);



    }

    public static void arrayNumSum(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length ; i++)
            sum = sum + array[i];
        System.out.println(sum);

    }

    public static void fillArray(int[] array,int number)
    {
        for (int i = 0; i < array.length ; i++) {
             array[i] = number;
        }
    }

    static int min(int a, int b)
    {
        return (a < b ? a : b) ;

    }
}
