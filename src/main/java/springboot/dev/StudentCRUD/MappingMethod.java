package springboot.dev.StudentCRUD;

import org.mapstruct.Mapper;
import springboot.dev.StudentCRUD.DTO.StudentDTO;
import springboot.dev.StudentCRUD.Entities.Student;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MappingMethod {

//    @Mapping(source = "id", target = "name")
//    @Mapping(source = "department", target = "descr")
    StudentDTO studentMapper(Student student);
    List<StudentDTO> studentMapper(List<Student> student);
}
