package myproject.service;

import lombok.RequiredArgsConstructor;
import myproject.model.Doctor;
import myproject.repository.DoctorRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepository doctorRepo;

    public Doctor registerDoctor(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    public Doctor login(String username, String password) {
        Doctor doc = doctorRepo.findByUsername(username);
        return (doc != null && doc.getPassword().equals(password)) ? doc : null;
    }
}
