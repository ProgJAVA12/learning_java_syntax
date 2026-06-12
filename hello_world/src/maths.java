

public class maths {

    static String number = "";
    static int num = 0;

    public static int sum(int a, int b)
    {
        return a + b;
    }

    public static int power(int a, int b)
    {
        return a * b;
    }

    public static int powerX(int a, int b)
    {
        int result = a;
        for (int i = 1; i < b; i++) {
         result = result * a;

        }
        return result;
    }

    public static String convertToBinary(int a)
    {

        if(a == 0)
            return null;

        while (a != 0)
        {
            number = (a % 2) + number;
            a = a / 2;
        }

        return number;
    }

    public static String convertToHexadecimal(int a)
    {

        while (a != 0)
        {
           if(a % 16 >= 10)
               number = String.valueOf((char)((a % 16) + 55)) + number;
           else
               number = (a % 16) + number;
           a = a / 16;

        }
        return number;
    }

    public static String convertToQuinary(int a)
    {
        while(a != 0)
        {
            number = (a % 5) + number;
            a = a / 5;
        }
        return number;
    }
}
