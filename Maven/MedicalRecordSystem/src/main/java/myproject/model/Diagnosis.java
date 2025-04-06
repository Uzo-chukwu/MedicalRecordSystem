package myproject.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Diagnosis {
    private String condition;
    private String description;
}
