package myproject.model;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreatmentPlan {
    private String planTitle;
    private String conditionBeingTreated;
    private List<String> medications; // List of medications prescribed
    private List<String> therapies;   // e.g., physiotherapy, psychotherapy
    private String lifestyleRecommendations; // e.g., diet, exercise
    private String procedures;        // any medical procedures recommended
    private LocalDate startDate;
    private LocalDate endDate;
    private String followUpInstructions;
}
