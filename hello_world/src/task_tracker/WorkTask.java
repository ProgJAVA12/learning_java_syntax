package task_tracker;


public class WorkTask extends Task {
    private final int id;
    private final String taskName;
    private final String date;
    private String status;
    private String labelTask;

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

    public WorkTask(int id, String taskName, String date) {
        this.id = id;
        this.taskName = taskName;
        this.date = date;
        this.status = "Новая";
        this.labelTask = "Рабочая задача";
    }

    @Override
    public String toString() {
        return " " + id + " | " + labelTask + taskName + " " + "Создана : " + date + " [" + status + "]";
    }
}
