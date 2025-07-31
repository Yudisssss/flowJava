public class Task {
    public String nameTask;
    public String idTask;
    public String aboutTask;

    public Task(String nameTask, String idTask, String aboutTask) {
        this.nameTask = nameTask;
        this.idTask = idTask;
        this.aboutTask = aboutTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public void setIdTask(String idTask) {
        this.idTask = idTask;
    }

    public void setAboutTask(String aboutTask) {
        this.aboutTask = aboutTask;
    }

    public String getNameTask() {
        return nameTask;
    }

    public String getIdTask() {
        return idTask;
    }

    public String getAboutTask() {
        return aboutTask;
    }
}
