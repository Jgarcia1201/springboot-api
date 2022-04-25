package com.example.productivity.Controller;

import com.example.productivity.Model.Goal;
import com.example.productivity.Service.GoalService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/goals")
@CrossOrigin("http://localhost:4200")
public class GoalController {

    private final GoalService goalService;

    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    @GetMapping("/{userId}")
    public Optional<Goal[]> findByUserId(@PathVariable(value = "userId") int userId) {
        return goalService.findByUserId(userId);
    }

    @GetMapping("/byid/{id}")
    public Optional<Goal> findById(@PathVariable(value = "id") int id) {
        return goalService.findById(id);
    }

    @PostMapping("/add")
    public int addGoal(@RequestBody Goal goal) {
        return goalService.addGoal(goal);
    }

    @PutMapping("/update/{id}")
    public void updateGoal(@PathVariable(value = "id") int id, @RequestBody Goal goal) {
        goalService.updateGoal(id, goal);
    }



}
