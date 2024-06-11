package mysecurity.example.mysecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mysecurity.example.mysecurity.entity.Laptop;
@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
}


