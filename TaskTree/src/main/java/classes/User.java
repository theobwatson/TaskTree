package classes;

import java.util.Date;

public class User {
    private String name;
    private int tasksCompleted;
    private Task currentTask;
    private Date totalTimeSpent;
    private TaskTree personalTree;
    
    public User(String name){
        this.name = name;
    }
}
