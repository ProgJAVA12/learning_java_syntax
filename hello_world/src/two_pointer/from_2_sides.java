package two_pointer;

import java.util.Arrays;

public class from_2_sides {
    //Паттерн два указателя(С ДВУХ СТОРОН)
    // На вход подается отсортированный массив(!) и число(сумма 2 элементов массива)
    //Необходимо найти позиции(индексы) двух элементов, сумма которых будет ровна входящему числу

    void main() {

        int[] number = {3,2,4};
        String result = Arrays.toString(two_sum(number,6));
        System.out.println(result);

    }


     public static int[] two_sum(int[] array, int target){
        // Создаем два указателя
         int left = 0;  // Устанавливаем левый указатель на начало массива
         int right = array.length - 1; // Устанавливаем правый указатель на конец массива

        while(left < right)  // До тех пор, пока указатели не встретились
        {
            int current_sum = array[left] + array[right]; // Сумма элементов под указателями

            if(current_sum == target) // Если сумма == входящему числу(target)
                return new int[]{left,right}; // Возвращаем индексы элементов под указателями
            else if(current_sum > target) // Если сумма > входящего числа(target)
                right--;                  // Двигаем правый указатель к левому
            else                          // В любом другом случае
                left++;                   // Двигаем левый указатель к правому
        }
        return new int[]{-1, -1};         //Если входящее число(target) не найдено, то его гарантировано нет
     }

}
