package springboot.dev.StudentCRUD.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springboot.dev.StudentCRUD.DTO.StudentDTO;
import springboot.dev.StudentCRUD.Entities.Student;
import springboot.dev.StudentCRUD.Service.StudentService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/student")
public class StudentController {

    final private StudentService studentService;

    @GetMapping
    public List<StudentDTO> allStudentController(){
        return studentService.allStudentService();
    }

    @GetMapping("/{id}")
    public StudentDTO getCourseController(@PathVariable String id){
        return studentService.getStudentService(id);
    }

    @PostMapping
    public void postStudentController(@RequestBody Student student){
        studentService.postStudentService(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentController(@PathVariable String id){
        studentService.deleteStudentService(id);
    }

    @PutMapping("/{id}")
    public void putStudentController(@RequestBody Student student){
        studentService.putStudentService(student);
    }


}
