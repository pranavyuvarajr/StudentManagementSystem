package springboot.dev.courseregistration;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import springboot.dev.courseregistration.DTO.UserDTO;
import springboot.dev.courseregistration.Entities.CourseTopic;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MappingMethod {

    @Mapping(source = "id", target = "name")
    @Mapping(source = "description", target = "descr")
    UserDTO userMapper(CourseTopic courseTopic);
    List<UserDTO> userMapper(List<CourseTopic> courseTopic);
}
