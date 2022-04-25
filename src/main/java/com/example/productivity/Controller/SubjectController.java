package com.example.productivity.Controller;

import com.example.productivity.Model.Subject;
import com.example.productivity.Service.SubjectService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/subject")
@CrossOrigin("http://localhost:4200")
public class SubjectController {

    private final SubjectService subjectService;

    SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping("/getbyuserid/{id}")
    public Optional<Subject[]> findByUserId(@PathVariable(name = "id") int userId) {
        return subjectService.findByUserId(userId);
    }

    @GetMapping("/getbyid/{id}")
    public Optional<Subject> findById(@PathVariable(name = "id") int id) {
        return subjectService.findById(id);
    }

    @PostMapping("/add")
    public void addSubject(@RequestBody Subject subject) {
        subjectService.addSubject(subject);
    }

    @PutMapping("/update/{id}")
    public void updateSubject(@PathVariable(name = "id") int id, @RequestBody Subject subject) {
        subjectService.updateSubject(id, subject);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSubject(@PathVariable(name = "id") int id) {
        subjectService.deleteSubject(id);
    }

}
