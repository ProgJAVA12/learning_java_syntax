public class learning_array2 {

    static void main() {

        int[][] array = new int[4][];
        array[0] = new int[]{1,2,3,4,5};
        array[1] = new int[]{1,2,3,4};
        array[2] = new int[]{1,2,3};
        array[3] = new int[]{1,2};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
