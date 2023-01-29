package classes;

import enums.Priority;
import java.util.ArrayList;

public class TaskTree {

    private Task root;
    private Task singleRoot;
    private int numTasks;
    public User user;
    public TaskTree completed;

    public TaskTree(String name) {
        this.user = new User(name);
    }

    public void add(Task newTask) {
        if (root == null) {
            singleRoot = newTask;
            root = newTask;
            numTasks++;
        } else {
            add(root, newTask);
        }
    }

    public void add(Task root, Task newTask) {
        if (root.compareTo(newTask) >= 0) {
            if (root.getLessPriority() != null) {
                add(root.getLessPriority(), newTask);
            } else {
                root.setLessPriority(newTask);
                numTasks++;
            }
        } else if (root.compareTo(newTask) < 0) {
            if (root.getMorePriority() != null) {
                add(root.getMorePriority(), newTask);
            } else {
                root.setMorePriority(newTask);
                numTasks++;
            }
        }
    }

    // Returns tring of Task order (by Priority) 
    public void traversal() {
        //  ArrayList list = new ArrayList<String>();
        traversal(root);
        //  return list;
    }

    private void traversal(Task root) {
        if (root != null) {
            traversal(root.getMorePriority());
            System.out.println(root.getTitle());
            traversal(root.getLessPriority());
        }
    }

    // remove task
    public void remove(Task toRemove) {
        if (root != null) {
            TaskTree temp = new TaskTree("");

            if (root.compareTo(toRemove) != 0) {
                temp.root = singleRoot;
            }

            numTasks = 0;
            remove(temp, root, toRemove);
            this.root = temp.root;
        }
    }

    // iterative method
    public void remove(TaskTree temp, Task root, Task toRemove) {
        if (root.compareTo(toRemove) > 0) {
            if (root.getLessPriority() != null) {
                temp.add(root.getLessPriority());
            } else {
                temp.add(root.getLessPriority());
                numTasks++;
            }
        } else if (root.compareTo(toRemove) < 0) {
            if (root.getMorePriority() != null) {
                temp.add(root.getMorePriority());
            } else {
                root.setMorePriority(toRemove);
                numTasks++;
            }
        }
    }

    // Returns tring of Task order (by Priority) 
    public ArrayList returnList() {
        ArrayList list = new ArrayList<String>();
        returnList(root, list);
        return list;
    }

    private void returnList(Task root, ArrayList list) {
        if (root != null) {
            returnList(root.getMorePriority(), list);
            list.add(root.getTitle());
            returnList(root.getLessPriority(), list);
        }
    }

    // implement
    public void search() {

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
        task.add(five);

        ArrayList test = new ArrayList<String>();
        task.traversal();
        test = task.returnList();
        System.out.println(test);

        task.remove(three);
        task.traversal();
        test = task.returnList();
        System.out.println(test);

        System.out.println((three.compareTo(three)) + "");
    }
}
