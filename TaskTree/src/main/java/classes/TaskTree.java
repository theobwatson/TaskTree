package classes;

public class TaskTree {

	private Task root;
        private int numTasks;
	
	public TaskTree() {
	}
	
	public void add(Task newTask) {
            if(root == null) {
                root = newTask;
                numTasks++;
            } else {
                add(root, newTask);
            }
	}
	
	public void add(Task root, Task newTask) {
            if (root.compareTo(newTask) >= 0){
                if (root.getLessPriority() != null) {
                    add(root.getLessPriority(), newTask);
                } else {
                    root.setLessPriority(newTask);
                    numTasks++;
                }
            } else if (root.compareTo(newTask) < 0){
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
        traversal(root);
        }

        private void traversal(Task root) {
         if (root != null) {
            traversal(root.getMorePriority());
            System.out.println(root.getTitle());
            traversal(root.getLessPriority());
            }
        }
        
        
        
        public void remove(Task newTask){
          if(root != null) {
              remove(newTask, root);
          }
        }
        
        public void remove(Task root, Task newTask){
          if (root.compareTo(newTask) >= 0){
                if (root.getLessPriority() != null) {
                    remove(root.getLessPriority(), newTask);
                } else {
                    root.setLessPriority(newTask);
                    numTasks--;
                }
            } else if (root.compareTo(newTask) < 0){
                if (root.getMorePriority() != null) {
                    add(root.getMorePriority(), newTask);
                } else {
                    root.setMorePriority(newTask);
                    numTasks++;
                }
            }
        }
}
