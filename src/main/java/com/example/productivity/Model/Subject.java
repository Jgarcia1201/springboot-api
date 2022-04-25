package com.example.productivity.Model;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    int id;

    @Column(name = "user_id")
    int userId;

    @Column(name = "goal_sec")
    int goalSec;

    @Column(name = "current_sec")
    int currentSec;

    @Column(name = "title")
    String title;

    Subject() {

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

    public int getGoalSec() {
        return goalSec;
    }

    public void setGoalSec(int goalSec) {
        this.goalSec = goalSec;
    }

    public int getCurrentSec() {
        return currentSec;
    }

    public void setCurrentSec(int currentSec) {
        this.currentSec = currentSec;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
