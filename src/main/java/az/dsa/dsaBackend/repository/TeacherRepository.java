package az.dsa.dsaBackend.repository;

import az.dsa.dsaBackend.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{
}
