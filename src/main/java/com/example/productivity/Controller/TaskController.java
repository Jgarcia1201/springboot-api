package com.example.productivity.Controller;

import com.example.productivity.Model.Task;
import com.example.productivity.Repository.TaskRepo;
import com.example.productivity.Service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin("http://localhost:4200")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // Get User By Id
    @GetMapping("/{userId}")
    public Optional<Task[]> findByUserId(@PathVariable(value = "userId") int userId) {
        return taskService.findByUserId(userId);
    }

    @GetMapping("/edit/{id}")
    public Task findById(@PathVariable(value = "id") int id) {
        return taskService.getTask(id);
    }

    @PostMapping("")
    public int addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @PutMapping("/edit/{id}")
    public void updateTask(@PathVariable(value="id") int id, @RequestBody Task task) {
        taskService.updateTask(id, task);
    }

    @DeleteMapping("/{taskId}")
    public void finishTask(@PathVariable(value = "taskId") int id) {
        taskService.finishTask(id);
    }
}
