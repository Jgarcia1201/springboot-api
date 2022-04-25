package com.example.productivity.Service;

import com.example.productivity.Model.Goal;
import com.example.productivity.Repository.GoalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GoalService {

    @Autowired
    private GoalRepo goalRepo;

    public GoalService(GoalRepo goalRepo) {
        this.goalRepo = goalRepo;
    }

    public Optional<Goal[]> findByUserId(int userId) {
        return goalRepo.findByUserId(userId);
    }

    public Optional<Goal> findById(int id) {
        return goalRepo.findById(id);
    }

    public int addGoal(Goal goal) {
        Goal newGoal = goalRepo.save(goal);
        return newGoal.getId();
    }

    public void updateGoal(int id, Goal goal) {
        goal.setId(id);
        this.goalRepo.save(goal);
    }

}
