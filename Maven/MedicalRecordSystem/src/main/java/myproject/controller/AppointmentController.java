package myproject.controller;

import lombok.RequiredArgsConstructor;
import myproject.model.Appointment;
import myproject.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/appointment")
@RequiredArgsConstructor
public class AppointmentController {
    private final AppointmentService appointmentService;

    @PostMapping("/book")
    public Appointment book(@RequestBody Appointment appointment) {
        return appointmentService.book(appointment);
    }
}
