package com.example.productivity.Controller;

import com.example.productivity.Model.Note;
import com.example.productivity.Service.NoteService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin("http://localhost:4200")
public class NoteController {

    private final NoteService noteService;

    NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/{noteId}")
    public Optional<Note[]> findByGoalId(@PathVariable(value = "noteId") int goalId) {
        return noteService.findByGoalId(goalId);
    }

    @GetMapping("/deets/{id}")
    public Optional<Note> findById(@PathVariable(value = "id") int id) {
        return noteService.findById(id);
    }

    @PostMapping("/add")
    public int addNote(@RequestBody Note note) {
        return noteService.addNote(note);
    }

    @PutMapping("/edit/{id}")
    public void updateNote(@PathVariable(value = "id") int id, @RequestBody Note note) {
        noteService.updateNote(id, note);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteNote(@PathVariable(value = "id") int id) {
        noteService.deleteNote(id);
    }
}
