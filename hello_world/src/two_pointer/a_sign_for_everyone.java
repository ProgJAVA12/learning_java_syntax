package two_pointer;

import java.util.ArrayList;
import java.util.List;
// Паттерн каждому по указателю
public class a_sign_for_everyone {


    public static void main() {
        int[] arr = {1,4,6,7,8,10};
        int[] arr2 = {2,6,7,8,10,12};
        String result = interset(arr, arr2).toString();
        System.out.println(result);
    }
    // Создаем метод, который принимает 2 массива и отдает Список одинаковых элементов
    public static List<Integer> interset(int[] arrayOne, int[] arrayTwo){
        int p1 = 0; // Указатель Первого массива
        int p2 = 0; // Указатель Второго массива
        List<Integer> result = new ArrayList<>();   // Создаем список для хранения результата

        while (p1 < arrayOne.length && p2 < arrayTwo.length){ // Пока указатели первого и второго массива не дошли до конца массивов
            if (arrayOne[p1] < arrayTwo[p2]){       // Если элемент массива под первым указателем(p1) < чем элемент 2-го массива под вторым указателем(p2)
                p1 += 1;                            // Двигаем указатель первого массива слева направо
            }else if(arrayOne[p1] > arrayTwo[p2]) { // Если же элемент массива под первым указателем(p1) > элемент массива под вторым указателем(p2)
                p2 += 1;                            // Двигаем указатель второго массива слева направо
            }else {
                result.add(arrayOne[p1]);           //Иначе сохраняем элемент 1 массива в список(result)
                p1++;                               // Двигаем оба указателя на 1 элемент вперед
                p2++;
            }

        }
        return result;
    }
}
