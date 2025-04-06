package myproject.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalRecord {
    private Diagnosis diagnosis;
    private Prescription prescription;
    private TreatmentPlan treatmentPlan;
    private HealthProfile healthProfile;
}
