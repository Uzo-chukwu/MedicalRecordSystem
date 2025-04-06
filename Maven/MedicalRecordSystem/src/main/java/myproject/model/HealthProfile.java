package myproject.model;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthProfile {
    private double weight; // in kilograms
    private double height; // in meters
    private String bloodType; // e.g. A+, B-, O+
    private String genotype; // e.g. AA, AS, SS
    private List<String> allergies; // e.g. ["Peanuts", "Dust"]
    private boolean hasHadSurgery;
    private String surgeryDetails; // If hasHadSurgery is true
    private String chronicIllnesses; // e.g. Diabetes, Hypertension
    private String medications; // e.g. drugs taken regularly
    private String immunizationHistory; // e.g. COVID-19, Yellow Fever
    private String lifestyleNotes; // e.g. smoker, alcohol consumption, exercise routine
}
