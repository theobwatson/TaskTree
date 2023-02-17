package task;

import enums.Priority;
import java.util.ArrayList;
import java.util.Collections;

public class TaskTree {

    public ArrayList<Task> tree;
    public ArrayList<Task> completed;
    public User user;

    public TaskTree(String name) {
        this.completed = new ArrayList<>();
        this.tree = new ArrayList<>();
        this.user = new User(name);
    }

    public void add(Task newTask) {
        tree.add(newTask);
        Collections.sort(tree);
    }
    
    public void removeTask(Task toRemove){
        if(tree.contains(toRemove)){
            tree.remove(toRemove);
            completed.add(toRemove);
            Collections.sort(tree);
        } else {
            System.out.println("no task in tree");
        }
    }
    
    public static void main(String[] args) {
        TaskTree task = new TaskTree("me");

        Task one = new Task("Implement string list return");
        Task two = new Task("Commit recent changes");
        Task three = new Task("Update website with portfolio");
        Task four = new Task("Go to bed");
        Task five = new Task("Send email");
        Task six = new Task("Eat");

        one.setPriority(Priority.VERYHIGH);
        two.setPriority(Priority.MEDIUM);
        three.setPriority(Priority.LOW);
        four.setPriority(Priority.HIGH);
        five.setPriority(Priority.VERYLOW);
        six.setPriority(Priority.VERYHIGH);

        task.add(one);
        task.add(three);
        task.add(two);
        task.add(four);
        task.add(six);
        // task.add(five);
        
        System.out.println(task.tree);
        task.removeTask(six);
        task.removeTask(three);
        
        System.out.println(task.tree);
        
    }
}
