package com.example.CureWell.services;

import com.example.CureWell.entity.DoctorSpec;

import java.time.LocalDate;
import java.util.List;

public interface DoctorSpecService {
    List<DoctorSpec> getAllDoctorSpec();
    DoctorSpec addDoctorSpecialization(Long doctorId, String specCode, LocalDate specializationDate);
}
