package classes;

import enums.Priority;

public class TaskTree {

	Task data;
	Task root;
	
	public TaskTree(Task data) {
		this.data = data;
	}
	
	public void add(Task data) {
		if(root == null) {
			root = data;
		} else if(root.compareTo(data) >= 0) {
			add(data, root.getLessPriority());
		} else {
			root.setMorePriority(data);
		}
	}
	
	public void add(Task data, Task root) {
		
	}
	
}
