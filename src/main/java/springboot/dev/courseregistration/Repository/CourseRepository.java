package springboot.dev.courseregistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.dev.courseregistration.Entities.CourseTopic;

public interface CourseRepository extends JpaRepository<CourseTopic, String> {
}
