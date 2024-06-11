package mysecurity.example.mysecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mysecurity.example.mysecurity.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}


