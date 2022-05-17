package com.example.productivity.Service;

import com.example.productivity.Model.Goal;
import com.example.productivity.Model.Note;
import com.example.productivity.Repository.GoalRepo;
import com.example.productivity.Repository.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NoteService {

    @Autowired
    private NoteRepo noteRepo;

    NoteService(NoteRepo noteRepo) {
        this.noteRepo = noteRepo;
    }

    public Optional<Note[]> findByGoalId(int goalId) {
        return noteRepo.findByGoalId(goalId);
    }

    public Optional<Note> findById(int id) {
        return noteRepo.findById(id);
    }

    public void updateNote(int id, Note note) {
        note.setId(id);
        this.noteRepo.save(note);
    }

    public void deleteNote(int id) {
        this.noteRepo.deleteById(id);
    }

    public int addNote(Note note) {
        Note newNote = noteRepo.save(note);
        return newNote.getId();
    }

}
