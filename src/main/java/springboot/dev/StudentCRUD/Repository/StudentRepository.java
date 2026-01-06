package springboot.dev.StudentCRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.dev.StudentCRUD.Entities.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

}
