package springboot.dev.courseregistration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/course")
public class CourseController {

    final private CourseService courseService;

    @GetMapping
    public List<UserDTO> allCourseController(){
        return courseService.allCoursesService();
    }

    @GetMapping("/{id}")
    public UserDTO getCourseController(@PathVariable String id){
        return courseService.coursesService(id);
    }

    @PostMapping
    public void postCourseController(@RequestBody CourseTopic topic){
        courseService.postCourseService(topic);
    }

    @DeleteMapping("/{id}")
    public void deleteCourseController(@PathVariable String id){
        courseService.deleteCourseService(id);
    }

    @PutMapping("/{id}")
    public void putCourseController(@RequestBody CourseTopic topic, @PathVariable String id){
        courseService.putCourseService(topic, id);
    }


}
