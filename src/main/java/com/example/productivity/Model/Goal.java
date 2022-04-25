package com.example.productivity.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "goals")
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goal_id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "title")
    private String title;

    public Goal(int userId, String title) {
        this.userId = userId;
        this.title = title;
    }

    public Goal() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
