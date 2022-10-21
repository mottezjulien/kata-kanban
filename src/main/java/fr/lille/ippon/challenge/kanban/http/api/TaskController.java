package fr.lille.ippon.challenge.kanban.http.api;

import fr.lille.ippon.challenge.kanban.domain.StatusEnum;
import fr.lille.ippon.challenge.kanban.domain.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/task")
public class TaskController {

    private List<Task> list = List.of(new Task("my first task", StatusEnum.TODO));

    @GetMapping
    public List<Task> getTasks() {
        return list;
    }

    public void changeStatus(String title, StatusEnum status) {

    }


    public Task getTask(String title) {
        return list.stream()
                .filter(task -> task.getTitle().equals(title))
                .findFirst()
                .orElse(null);
    }

    public List<Task> getList() {
        return list;
    }

    public void setList(List<Task> list) {
        this.list = list;
    }
}
