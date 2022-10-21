package fr.lille.ippon.challenge.kanban.http.api;

import fr.lille.ippon.challenge.kanban.domain.StatusEnum;
import fr.lille.ippon.challenge.kanban.domain.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TaskControllerTest {

    private TaskController controller;

    private List<Task> list;

    private String title = "my first task";

    @BeforeEach
    void setUp() {
        controller = new TaskController();
        list = List.of(new Task(title, StatusEnum.TODO));
        controller.setList(list);
    }

    @Test
    void list() {
        List<Task> tasks = controller.getTasks();
        assertThat(tasks).isNotEmpty();
    }

    @Test
    void changeStatus() {
        StatusEnum status = StatusEnum.DOING;
        controller.changeStatus(title, status);
        Task task = controller.getTask(title);
        assertThat(task.getStatus()).isEqualTo(status);
    }

}