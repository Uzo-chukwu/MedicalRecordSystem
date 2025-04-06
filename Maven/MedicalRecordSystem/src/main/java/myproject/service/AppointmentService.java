package myproject.service;

import lombok.RequiredArgsConstructor;
import myproject.model.Appointment;
import myproject.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepo;

    public Appointment book(Appointment appointment) {
        return appointmentRepo.save(appointment);
    }
}
