package com.example.demo.Repositorys;

import com.example.demo.model.PatientRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRecordRepository extends JpaRepository<PatientRecord, Long> {

}
