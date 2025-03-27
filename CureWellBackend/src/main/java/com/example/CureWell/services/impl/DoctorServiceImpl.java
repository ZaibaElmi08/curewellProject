package com.example.CureWell.services.impl;

import com.example.CureWell.entity.Doctor;
import com.example.CureWell.repository.DoctorRepository;
import com.example.CureWell.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;

    // Constructor injection
    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    // Implement the getAllDoctors() method
    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    // Implement the getDoctorById() method
    @Override
    public Doctor getDoctorById(Long docId) {
        return doctorRepository.findById(docId)
                .orElseThrow(() -> new RuntimeException("Doctor not found with id " + docId));
    }

    // Implement the addDoctor() method
    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // Implement the updateDoctor() method
    @Override
    public Doctor updateDoctor(Long docId, Doctor doctorDetails) {
        Doctor doctor = doctorRepository.findById(docId)
                .orElseThrow(() -> new RuntimeException("Doctor not found with id " + docId));

        // Update fields as needed (e.g., updating name, specialization)
        doctor.setDoctorName(doctorDetails.getDoctorName());
        // Add other fields to update as necessary

        return doctorRepository.save(doctor);
    }

    // Implement the deleteDoctor() method
    @Override
    public void deleteDoctor(Long docId) {
        doctorRepository.deleteById(docId);
    }



}
