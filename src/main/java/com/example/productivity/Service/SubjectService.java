package com.example.productivity.Service;

import com.example.productivity.Model.Subject;
import com.example.productivity.Repository.SubjectRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectService {

    private SubjectRepo subjectRepo;

    SubjectService(SubjectRepo subjectRepo) {
        this.subjectRepo = subjectRepo;
    }

    public Optional<Subject[]> findByUserId(int userId) {
        return subjectRepo.findByUserId(userId);
    }

    public Optional<Subject> findById(int id) {
        return subjectRepo.findById(id);
    }

    public void addSubject(Subject subject) {
        subjectRepo.save(subject);
    }

    public void updateSubject(int id, Subject subject) {
        subject.setId(id);
        subjectRepo.save(subject);
    }

    public void deleteSubject(int id) {
        subjectRepo.deleteById(id);
    }
}
