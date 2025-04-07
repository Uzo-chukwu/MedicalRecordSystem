package myproject.service;

import myproject.model.MedicalRecord;
import myproject.repository.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalRecordService {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    public MedicalRecord createMedicalRecord(MedicalRecord medicalRecord) {
        return medicalRecordRepository.save(medicalRecord);
    }

    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecordRepository.findAll();
    }

    public Optional<MedicalRecord> getMedicalRecordById(String id) {
        return medicalRecordRepository.findById(id);
    }

    public MedicalRecord updateMedicalRecord(String id, MedicalRecord updatedRecord) {
        return medicalRecordRepository.findById(id).map(record -> {
            record.setDiagnosis(updatedRecord.getDiagnosis());
            record.setPrescription(updatedRecord.getPrescription());
            record.setTreatmentPlan(updatedRecord.getTreatmentPlan());
            record.setHealthProfile(updatedRecord.getHealthProfile());
            return medicalRecordRepository.save(record);
        }).orElseThrow(() -> new RuntimeException("Medical Record not found with ID: " + id));
    }

    public void deleteMedicalRecord(String id) {
        medicalRecordRepository.deleteById(id);
    }
}
