package task_tracker;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import static task_tracker.Menu.getCurrentFormattedDate;
//import static task_tracker.Menu.readMenuChoice;


public abstract class TaskManager extends Main {
    private static final Map<Integer, Task> taskMap = new HashMap<>();
    private static final Map<Integer, Task> workTaskMap = new HashMap<>();
    private static final Map<Integer, Task> deadlineTaskMap = new HashMap<>();
    private static final Map<Integer, Task> allTaskMap = new HashMap<>();
    private static int counterTask = 0;
    private static final Scanner scanner = new Scanner(System.in);
    private static final String taskDirectory = "saves/Task.txt";
    private static final String workTaskDirectory = "saves/workTask.txt";
    private static final String deadlineTaskDirectory = "saves/deadlineTask.txt";
    private static final String allTaskDirectory = "saves/allTask.txt";
    public static Map<Integer, Task> getTaskMap(){
        return taskMap;
    }
    public static Map<Integer, Task> getWorkTaskMap(){
        return workTaskMap;
    }
    public static Map<Integer, Task> getDeadlineTaskMap(){
        return deadlineTaskMap;
    }

    public static void viewTaskByType(Map<Integer, Task> map, int marker)
    {
        if(!map.isEmpty()) {
            System.out.printf("%3s\t | %15s\t\t | %15s\t | %17s\t | %5s%n", "ID", "ТИП", "НАЗВАНИЕ", "ДАТА СОЗДАНИЯ", "СТАТУС");
            System.out.println("==============================================================");
            for (Task task : map.values()) {
                System.out.printf("%3d\t | %15s\t | %-20s\t | %-18s\t | [%s]%n",
                        task.getId(),
                        task.getLabelTask(),
                        task.getTaskName(),
                        task.getDate(),
                        task.getStatus());
            }

            System.out.println("==============================================================\n");

        }else {
            System.out.println("Список задач пуст!!\n");

        }
        if(marker == 0) {
            System.out.println("Нажмите \"ENTER\" чтобы продолжить");
            scanner.nextLine();
        }
    }

    public static void viewAllTask() {
        viewTaskByType(taskMap,1);
        viewTaskByType(workTaskMap, 1);
        viewTaskByType(deadlineTaskMap, 1);
        System.out.println("Нажмите \"ENTER\" чтобы продолжить");
        scanner.nextLine();

    }

    public static void searchTaskByType(Map<Integer, Task> map) {

        System.out.println("Введите ID Задачи : ");

        int searchId = Menu.readMenuChoice();
        if (map.containsKey(searchId)) {
            System.out.println("\n" + map.get(searchId) + "\n\n");
        }else {
            System.out.println("\nЗадача не найдена\n\n");
        }
    }

    public static void addTaskByType(Map<Integer, Task> map) {

        System.out.println("Введите название задачи : ");
        String name = scanner.nextLine();
        Task task = new Task(counterTask++, name, getCurrentFormattedDate());
        map.put(task.getId(), task);

        System.out.println("\nЗадача добавлена\n");
        System.out.println("Нажмите \"ENTER\" для продолжения");
        scanner.nextLine();
    }

    public static void deleteTaskByType(Map<Integer, Task> map) {

        System.out.println("Введите ID задачи : ");
        int idDeleteTask = scanner.nextInt();

        if (map.containsKey(idDeleteTask)) {
            map.remove(idDeleteTask);
            System.out.println("\nЗадача удалена из списка\n");
        } else {
            System.out.println("\nЗадач нет!\n");
        }
        System.out.println("Нажмите \"ENTER\" для продолжения");
        scanner.nextLine();
        scanner.nextLine();
    }


    public static void searchTask() {
        searchTaskByType(taskMap);
        searchTaskByType(workTaskMap);
        searchTaskByType(deadlineTaskMap);
        System.out.println("Нажмите \"ENTER\" чтобы продолжить");
        scanner.nextLine();
    }

    public static void changeStatus(Map<Integer, Task> map) {

        System.out.println("\nВведите ID Задачи для выбора нового статуса : \n");
        int choose;
        int id = Menu.readMenuChoice();
        if (map.containsKey(id)) {
            System.out.println(
                    "Текущий статус : " + "[" + map.get(id).getStatus() + "]\n\r" +
                            "Выберите новый статус : \n\r" +
                            "1.В процессе.\n\r" +
                            "2.Завершено.\n\r" +
                            "3.Просрочена[!].\r\n");
            choose = Menu.readMenuChoice();
            switch (choose) {
                case 1 -> map.get(id).setStatus("В процессе");
                case 2 -> map.get(id).setStatus("Завершено");
                case 3 -> map.get(id).setStatus("Просрочена[!]");

            }
            System.out.println("\nСтатус задачи изменен\n");
        }else {
            System.out.println("Такой задачи нет!");
        }
        System.out.println("Нажмите \"ENTER\" для продолжения\n");
        scanner.nextLine();
    }

    public static void saveTaskOnFile() throws IOException {
           saveTasks(taskMap, taskDirectory);
           saveTasks(workTaskMap, workTaskDirectory);
           saveTasks(deadlineTaskMap, deadlineTaskDirectory);
           saveTasks(allTaskMap, allTaskDirectory);
    }

   public static void saveTasks(Map<Integer, Task> map, String path) throws IOException {
       Path paths = Path.of(path);
       for(Task task : map.values()){
           StringBuilder stringBuilder = new StringBuilder(String.join(";",
                   String.valueOf(task.getId()),
                   task.getTaskName(),
                   task.getDate(),
                   task.getStatus()
           ));

           if(!Files.exists(paths)){
               Files.createFile(paths);
           }
           Files.writeString((paths), stringBuilder, StandardCharsets.UTF_8);
       }
   }

    public static void loadTaskSaves() throws IOException {
          loadTaskOnFiles(taskMap, taskDirectory);
          loadTaskOnFiles(workTaskMap, workTaskDirectory);
          loadTaskOnFiles(deadlineTaskMap, deadlineTaskDirectory);
    }

    public static void loadTaskOnFiles(Map<Integer, Task> map, String paths) throws IOException {
        Path path = Path.of(paths);
        if (Files.exists(path)) {
            List<String> tasks = Files.readAllLines(path,StandardCharsets.UTF_8);
            for(int i = 0; i <= tasks.size() - 1; i++){
                String[] s = tasks.get(i).split(";");
                for(int j = 0; j < s.length - 1; j++){
                    Task task = new Task(Integer.parseInt(s[0]),s[1],s[2]);
                    task.setStatus(s[3]);
                    map.put(i, task);
                }
            }
        }
    }
}
