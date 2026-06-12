import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class do_while {

    static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[1];
        System.out.println("Привет!я хранилище данных, выберите необходимое действие : ");
        System.out.print("" +
                "1.ДОБАВИТЬ ЗНАЧЕНИE\n" +
                "2.УДАЛИТЬ ЗНАЧЕНИЕ\n" +
                "3.ПОСМОТРЕТЬ БАЗУ ДАННЫХ\n" +
                "0.ВЫЙТИ\n");
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            if(num == 1){
                System.out.println("ВВЕДИТЕ ИМЯ : ");
                array[0] = sc.next();
                break;
            }

        }
        System.out.flush();
        System.out.print("\r\n\n\n\n");
        for(int i = 0;i < array.length ;i++){
            System.out.println(array[i].toString());
        }





            }
        }



