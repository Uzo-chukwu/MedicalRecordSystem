package myproject.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient extends User {
    private MedicalRecord medicalRecord;
}
