package myproject.repositories;

import myproject.models.MedicalRecords;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicalRecordsRpository extends MongoRepository<MedicalRecords, String> {
}
