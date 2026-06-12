package task_tracker;

public class Task extends TaskManager {

    private String taskName;
    private String status;
    private String date;
    private int id;
    private String labelTask;

    public Task() {

    }

    public Task(int id, String taskName, String date) {
        this.id = id;
        this.taskName = taskName;
        this.date = date;
        this.status = "Новая";
        this.labelTask = "Обычная задача";

    }


    public void setLabelTask(String labelTask){
        this.labelTask = labelTask;
    }

    public String getLabelTask(){
        return labelTask;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getId(){
        return id;
  }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return " " + id + " | " + "Задача : " + taskName + " " + "Создана : " + date + " [" + status + "]";
    }

}