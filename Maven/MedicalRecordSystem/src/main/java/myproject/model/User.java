package myproject.model;


import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class User {
    @Id
    private String id;
    private String username;
    private String email;
    private String password;
}
