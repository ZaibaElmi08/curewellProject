package com.example.CureWell.services;

import com.example.CureWell.entity.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();
    Doctor getDoctorById(Long docId);
    Doctor addDoctor(Doctor doctor);
    Doctor updateDoctor(Long docId,Doctor doctor);
    void deleteDoctor(Long docId);

}
