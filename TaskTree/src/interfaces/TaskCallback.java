package interfaces;

import classes.Task;

public interface TaskCallback {
    void onTaskCreated(Task task);
}
