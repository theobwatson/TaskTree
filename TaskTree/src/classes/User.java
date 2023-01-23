package classes;

import enums.Priority;
import enums.UserLevel;
import java.util.Date;

public class User {

    private String name;
    private int tasksCompleted;
    private Task currentTask;
    private Date totalTimeSpent;
    private int leaves;
    private UserLevel ranking;

    public User(String name) {
        this.name = name;
        this.leaves = 0;
        this.tasksCompleted = 0;
        this.ranking = UserLevel.getLevel(leaves);
    }

    public void taskComplete() {

        this.setLeaves(this.getLeaves() + priorityCheck() + rankingCheck());
        this.setTasksCompleted(this.getTasksCompleted() + 1);
    }

    public int priorityCheck() {

        int leaves = 0;

        if (getCurrentTask().getPriority().equals(Priority.VERYHIGH)) {
            leaves += 25;
        } else if (getCurrentTask().getPriority().equals(Priority.HIGH)) {
            leaves += 20;
        } else if (getCurrentTask().getPriority().equals(Priority.MEDIUM)) {
            leaves += 15;
        } else if (getCurrentTask().getPriority().equals(Priority.MEDIUM)) {
            leaves += 10;
        } else if (getCurrentTask().getPriority().equals(Priority.LOW)) {
            leaves += 8;
        } else if (getCurrentTask().getPriority().equals(Priority.LOW)) {
            leaves += 6;
        }

        return leaves;
    }

    public int rankingCheck() {
        int bonus = 0;

        if (getRanking().equals(UserLevel.SAPLING)) {
            bonus += 3;
        } else if (getRanking().equals(UserLevel.TREE)) {
            bonus += 5;
        } else if (getRanking().equals(UserLevel.FOREST)) {
            bonus += 10;
        } else if (getRanking().equals(UserLevel.REDWOODFOREST)) {
            bonus += 15;
        }

        return bonus;
    }

    public void taskStarted() {
        this.setLeaves(this.getLeaves() + 5);
    }

    public void setCurrentTask(Task current) {
        this.currentTask = current;
    }

    public void rankCheck() {
        if (getLeaves() > getRanking().leaves) {
            this.setRanking(UserLevel.getLevel(getLeaves()));
        }
    }

    public void addTimeSpent(Date time) {

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the tasksCompleted
     */
    public int getTasksCompleted() {
        return tasksCompleted;
    }

    /**
     * @param tasksCompleted the tasksCompleted to set
     */
    public void setTasksCompleted(int tasksCompleted) {
        this.tasksCompleted = tasksCompleted;
    }

    /**
     * @return the currentTask
     */
    public Task getCurrentTask() {
        return currentTask;
    }

    /**
     * @return the totalTimeSpent
     */
    public Date getTotalTimeSpent() {
        return totalTimeSpent;
    }

    /**
     * @param totalTimeSpent the totalTimeSpent to set
     */
    public void setTotalTimeSpent(Date totalTimeSpent) {
        this.totalTimeSpent = totalTimeSpent;
    }

    /**
     * @return the leaves
     */
    public int getLeaves() {
        return leaves;
    }

    /**
     * @param leaves the leaves to set
     */
    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }

    /**
     * @return the ranking
     */
    public UserLevel getRanking() {
        return ranking;
    }

    /**
     * @param ranking the ranking to set
     */
    public void setRanking(UserLevel ranking) {
        this.ranking = ranking;
    }
}
