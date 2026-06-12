package task_tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {
private static final Scanner scanner = new Scanner(System.in);
   public static void start() {
       while(true) {
           System.out.println("\nВас приветствует \"Трекер задач\", выберите пункт Меню : \n");
           System.out.println("======================");
           System.out.print(
                   """
                           1.Обычные задачи.
                           \r\
                           2.Рабочие задачи.
                           \r\
                           3.Срочные задачи.
                           \r\
                           4.Показать все задачи.
                           \r\
                           5.Поиск задачи по ID.
                           \r\
                           0.Выход.
                           \r""");
           System.out.println("======================");

           int choice = readMenuChoice();

           switch (choice) {
               case 1 -> subMenu(TaskManager.getTaskMap(), "Обычные задачи");
               case 2 -> subMenu(TaskManager.getWorkTaskMap(), "Рабочие задачи");
               case 3 -> subMenu(TaskManager.getDeadlineTaskMap(), "Срочные задачи");
               case 4 -> TaskManager.viewAllTask(); // Нужно добавить мапу в которую будет добавлена вся инфа и закинуть ее сюда
               case 5 -> TaskManager.searchTask();
               case 0 -> {
                   return;
               }

           }
       }
   }

   private static void subMenu(Map<Integer, Task> map, String type){

       while(true) {
           System.out.println("\r=== " + type + " ===");
           System.out.println("======================");
           System.out.print(
                   """
                           1.Добавить задачу.
                           \r\
                           2.Удалить задачу.
                           \r\
                           3.Показать все задачи.
                           \r\
                           4.Изменить статус задачи.
                           \r\
                           0.Выход.
                           \r""");
           System.out.println("======================");

           int choice = readMenuChoice();
           switch (choice) {
               case 1 -> TaskManager.addTaskByType(map);
               case 2 -> TaskManager.deleteTaskByType(map);
               case 3 -> TaskManager.viewTaskByType(map, 0);
               case 4 -> TaskManager.changeStatus(map);
               case 0 -> {
                   return;
               }
           }

       }
   }

   public static int readMenuChoice(){
       while (true) {
           try {
               String input = scanner.nextLine();
               return Integer.parseInt(input);
           } catch (NumberFormatException e) {
               System.out.println("Ошибка!! Введите число");
           }
       }
   }

   public static String getCurrentFormattedDate() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy в HH:mm");
        return date.format(formatter);
    }
}

