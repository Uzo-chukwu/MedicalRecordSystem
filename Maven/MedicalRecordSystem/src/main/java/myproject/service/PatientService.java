package myproject.service;

import lombok.RequiredArgsConstructor;
import myproject.model.Patient;
import myproject.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepo;

    public Patient registerPatient(Patient patient) {
        return patientRepo.save(patient);
    }

    public Patient login(String username, String password) {
        Patient pat = patientRepo.findByUsername(username);
        return (pat != null && pat.getPassword().equals(password)) ? pat : null;
    }
}
