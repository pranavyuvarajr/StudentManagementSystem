package springboot.dev.StudentCRUD.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {
    @Id
    @NonNull
    @NotBlank
    private String id;
    @NonNull
    @NotBlank
    private String name;
    @NonNull
    @NotBlank
    private String department;
    @Email
    private String email;
    private String mobileNumber;
}
