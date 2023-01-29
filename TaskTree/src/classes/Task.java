package classes;

import java.util.Date;
import enums.TaskStatus;
import enums.Priority;

public class Task implements Comparable<Task> {

    private String title;
    private String description;
    private TaskStatus status;
    private Priority priority;
    private Date due;
    private Task lessPriority;
    private Task morePriority;

    public Task(String title) {
        setTitle(title);
        setStatus(TaskStatus.INPROGRESS);
    }

    public Task(String title, Date due) {
        setTitle(title);
        setStatus(TaskStatus.INPROGRESS);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public Task getLessPriority() {
        return lessPriority;
    }

    public void setLessPriority(Task lessPriority) {
        this.lessPriority = lessPriority;
    }

    public Task getMorePriority() {
        return morePriority;
    }

    public void setMorePriority(Task morePriority) {
        this.morePriority = morePriority;
    }

    @Override
    public int compareTo(Task o) {
        if (o != null) {
            return this.getPriority().numerical.compareTo(o.getPriority().numerical);
        }
        return 0;
    }

    public void setDueDate(int year, int month, int day) {

    }

    public void setDueDate(int year, int month, int day, int hrs, int mins) {

    }
}
