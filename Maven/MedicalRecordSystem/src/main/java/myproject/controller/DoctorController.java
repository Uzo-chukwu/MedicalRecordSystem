package myproject.controller;

import lombok.RequiredArgsConstructor;
import myproject.model.Doctor;
import myproject.service.DoctorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctor")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @PostMapping("/register")
    public Doctor register(@RequestBody Doctor doctor) {
        return doctorService.registerDoctor(doctor);
    }

    @PostMapping("/login")
    public Doctor login(@RequestBody Doctor doctor) {
        return doctorService.login(doctor.getUsername(), doctor.getPassword());
    }
}
