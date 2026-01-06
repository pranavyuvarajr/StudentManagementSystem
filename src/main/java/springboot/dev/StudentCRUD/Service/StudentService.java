package springboot.dev.StudentCRUD.Service;

import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import springboot.dev.StudentCRUD.Entities.Student;
import springboot.dev.StudentCRUD.MappingMethod;
import springboot.dev.StudentCRUD.Repository.StudentRepository;
import springboot.dev.StudentCRUD.DTO.StudentDTO;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {
    final StudentRepository studentRepository;
    final MappingMethod mappingMethod = Mappers.getMapper(MappingMethod.class);

    // Get all the students data
    public List<StudentDTO> allStudentService(){
        return mappingMethod.studentMapper(studentRepository.findAll());
    }

    // Get the student data by ID
    public StudentDTO getStudentService(String id){
        return mappingMethod.studentMapper(studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Id Not Found")));
    }

    // Create the student data
    public void postStudentService(Student student){
        studentRepository.save(student);
    }

    // Delete the student data using ID
    public void deleteStudentService(String id){
        studentRepository.deleteById(id);
    }

    // Edit the student data
    public void putStudentService(Student student){
        studentRepository.save(student);
    }
}
