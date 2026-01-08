package springboot.dev.StudentCRUD.Controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<StudentDTO>> allStudentController(){
        return new ResponseEntity<>(studentService.allStudentService(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getStudentController(@PathVariable String id){
        try {
            StudentDTO studentDTO = studentService.getStudentService(id);
            return new ResponseEntity<>(studentDTO, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Student> postStudentController(@RequestBody Student student){
        return new ResponseEntity<>(studentService.postStudentService(student), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Student> putStudentController(@RequestBody Student student){
        return new ResponseEntity<>(studentService.putStudentService(student), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudentController(@PathVariable String id){
        try {
            Student student = studentService.deleteStudentService(id);
            return new ResponseEntity<>(student, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
    }
}
