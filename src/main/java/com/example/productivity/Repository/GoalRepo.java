package com.example.productivity.Repository;

import com.example.productivity.Model.Goal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@Repository
@CrossOrigin("http://localhost:4200")
public interface GoalRepo extends CrudRepository<Goal, Integer> {

    Optional<Goal[]> findByUserId(int userId);

}
