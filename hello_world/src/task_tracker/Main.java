package task_tracker;

import java.io.IOException;

public class Main  {

  static void main() throws IOException {

      TaskManager.loadTaskSaves();
      Menu.start();
      //
      TaskManager.saveTaskOnFile();

    }
}


