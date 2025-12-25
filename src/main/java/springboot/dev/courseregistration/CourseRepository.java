package springboot.dev.courseregistration;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseTopic, String> {
}
