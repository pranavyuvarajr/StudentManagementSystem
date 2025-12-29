package springboot.dev.courseregistration.Service;

import lombok.AllArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import springboot.dev.courseregistration.Entities.CourseTopic;
import springboot.dev.courseregistration.MappingMethod;
import springboot.dev.courseregistration.Repository.CourseRepository;
import springboot.dev.courseregistration.DTO.UserDTO;

import java.util.List;

@AllArgsConstructor
@Service
public class CourseService {
    final CourseRepository courseRepository;
    final MappingMethod mappingMethod = Mappers.getMapper(MappingMethod.class);


//    List<CourseTopic> courses = new ArrayList<>(Arrays.asList(
//            new CourseTopic("java", "Java", "This is a Java course"),
//            new CourseTopic("c", "C", "This is a C course"),
//            new CourseTopic("c++", "C++", "This is a C++ course"),
//            new CourseTopic("python", "Python", "This is a Python course")
//    ));

    public List<UserDTO> allCoursesService(){
//        List<UserDTO> userDTOS = courseRepository
//                .findAll()
//                .stream()
//                .map(courseTopic -> new UserDTO(courseTopic))
//                .map(UserDTO::new)
//                .toList();
//        return userDTOS;

//        List<UserDTO> result = new ArrayList<>();
//
//        for(CourseTopic courseTopic : courseRepository.findAll()){
//            UserDTO userDTO = new UserDTO(courseTopic);
//
//            result.add(userDTO);
//        }
//
//        return result;

        return mappingMethod.userMapper(courseRepository.findAll());
    }



    public UserDTO coursesService(String id){
//        for(CourseTopic t : courses){
//            if(t.getId().equals(id)){
//                return t;
//            }
//        }
//        return null;
//        return courseRepository.findById(id).orElse(null);

//        return new UserDTO(courseRepository.findById(id).orElse(null));
        return mappingMethod.userMapper(courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Id Not Found")));
    }

    public void postCourseService(CourseTopic topic){
//        courses.add(topic);
        courseRepository.save(topic);
    }

    public void deleteCourseService(String id){
//        courses.remove(id);
        courseRepository.deleteById(id);
    }


    public void putCourseService(CourseTopic topic, String id){
//        for(int i = 0;i < courses.size();i++){
//            CourseTopic topic1 = courses.get(i);
//            if(topic1.getId().equals(id)){
//                courses.set(i, topic);
//            }
//        }
        courseRepository.save(topic);
    }
}
