public class Task {
    String taskName;
    Boolean taskIsDone;

    public Task(String taskName) {
        this.taskName = taskName;
        this.taskIsDone = false;
    }

    void markTaskAsDone(){
     this.taskIsDone = true;
    }
}
