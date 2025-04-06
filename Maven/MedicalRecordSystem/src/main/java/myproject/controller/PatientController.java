package myproject.controller;

import lombok.RequiredArgsConstructor;
import myproject.model.Patient;
import myproject.service.PatientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patient")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @PostMapping("/register")
    public Patient register(@RequestBody Patient patient) {
        return patientService.registerPatient(patient);
    }

    @PostMapping("/login")
    public Patient login(@RequestBody Patient patient) {
        return patientService.login(patient.getUsername(), patient.getPassword());
    }
}
