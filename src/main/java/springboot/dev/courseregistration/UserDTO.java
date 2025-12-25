package springboot.dev.courseregistration;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class UserDTO {
    private String name;
    private String description;

    public UserDTO(CourseTopic courseTopic){
        this.name = courseTopic.getName();
        this.description = courseTopic.getDescription();
    }
}
