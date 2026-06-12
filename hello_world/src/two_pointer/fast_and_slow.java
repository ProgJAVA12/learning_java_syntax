package two_pointer;

import java.util.Arrays;
import java.util.List;

public class fast_and_slow {

    static void main() {

        // Паттерн быстрый и медленный

        int[] array = {2,0,12,4,0,6,0};
        String result = Arrays.toString(replace(array));
        System.out.println(result);
    }


    public static int[] replace(int[] array){  //Создаем метод, который принимает массив и отдает массив
        int fast = 0; // Быстрый указатель
        int slow = 0; // Медленный указатель

        while(fast < array.length ){        // До тех пор, пока быстрый указатель не дошел до конца массива
            if(array[fast] != 0){           // Если элемент под быстрым указателем != 0
                int temp = array[slow];
                array[slow] = array[fast];  // меняем местами элементы медленного и быстрого указателя через временную переменную
                array[fast] = temp;
                slow ++ ;                  // Двигаем медленный указатель
            }
            fast ++;                       // Двигаем быстрый указатель(если элемент под ним = 0)
        }
        return array;
    }
}
