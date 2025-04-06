package myproject.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prescription {
    private String medication;
    private String dosage;
}
