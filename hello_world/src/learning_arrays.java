public class learning_arrays {

    static void main() {

        int[][] multyPly = {{1,2,3,4,5,6,7,8,9},
                           { 1,2,3,4,5,6,7,8,9}};

        for(int i = 1; i <= multyPly[0].length; i++)
        {

            for(int j = 1; j <= multyPly[1].length; j++)
            {

               int x = i * j;
                System.out.print(x + " ");
                if(x < 10)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
