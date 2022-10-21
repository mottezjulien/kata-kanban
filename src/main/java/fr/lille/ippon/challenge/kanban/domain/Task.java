package fr.lille.ippon.challenge.kanban.domain;

public class Task {

    private String title;

    private StatusEnum status;

    public Task(String title, StatusEnum status) {
        this.title = title;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
