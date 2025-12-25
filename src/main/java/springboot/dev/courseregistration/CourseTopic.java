package springboot.dev.courseregistration;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
class CourseTopic {

    @Id
    @NotBlank
    @NotNull
    private String id;
    @NotBlank
    @Schema(name = "name", example = "Course Name")
    private String name;
    @Schema(name = "description", example = "Description about the course")
    private String description;
}
