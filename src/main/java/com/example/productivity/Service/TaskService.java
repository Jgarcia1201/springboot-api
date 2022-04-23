package com.example.productivity.Service;

import com.example.productivity.Model.Task;
import com.example.productivity.Repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private final TaskRepo taskRepo;


    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public Optional<Task[]> findByUserId(int id) {
        return taskRepo.findByUserId(id);
    }

    public Task getTask(int id) {
        Optional<Task> res = taskRepo.findById(id);
        return res.orElse(null);
    }

    public Integer addTask(Task task) {
        Task newTask = taskRepo.save(task);
        return newTask.getId();
    }

    public void finishTask(int id) {
        taskRepo.delete(getTask(id));
    }

    public void updateTask(int id, Task task) {
        task.setId(id);
        taskRepo.save(task);
    }
}
