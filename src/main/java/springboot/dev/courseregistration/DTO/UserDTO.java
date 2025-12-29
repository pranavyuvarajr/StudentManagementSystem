package springboot.dev.courseregistration.DTO;


import lombok.Data;
import springboot.dev.courseregistration.Entities.CourseTopic;

@Data
public//@AllArgsConstructor
class UserDTO {
    private String name;
    private String descr;
}
