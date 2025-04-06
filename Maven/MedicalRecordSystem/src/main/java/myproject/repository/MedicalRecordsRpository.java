package myproject.repository;

import myproject.model.MedicalRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicalRecordsRpository extends MongoRepository<MedicalRecord, String> {
}
