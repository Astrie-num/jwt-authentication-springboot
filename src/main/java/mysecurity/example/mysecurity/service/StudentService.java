package mysecurity.example.mysecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mysecurity.example.mysecurity.entity.Student;
import mysecurity.example.mysecurity.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;
    public void addStudent(Student st) {
        repo.save(st);
    }
}


