package classes;
import java.util.Date;
import enums.TaskStatus;
import enums.Priority;

public class Task implements Comparable<Priority>{

	private String title;
	private String description;
	private TaskStatus status;
	private Priority priority;
	private Date dueDay;
	private Task lessPriority;
	private Task morePriority;
	
	public Task(String title){
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

	public Date getDueDay() {
		return dueDay;
	}

	public void setDueDay(Date dueDay) {
		this.dueDay = dueDay;
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
	public int compareTo(Priority o) {
		return this.compareTo(o);
	}
	
}

