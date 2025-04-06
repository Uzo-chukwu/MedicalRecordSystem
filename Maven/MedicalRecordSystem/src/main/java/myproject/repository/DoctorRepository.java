package myproject.repository;

import myproject.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRepository extends MongoRepository<Doctor, String> {
    Doctor findByUsername(String username);
}
