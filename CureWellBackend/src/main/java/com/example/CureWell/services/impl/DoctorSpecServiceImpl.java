package com.example.CureWell.services.impl;

import com.example.CureWell.entity.Doctor;
import com.example.CureWell.entity.DoctorSpec;
import com.example.CureWell.entity.Specialisation;
import com.example.CureWell.repository.DocterSpecRepository;
import com.example.CureWell.repository.DoctorRepository;
import com.example.CureWell.repository.SpecialisationRepository;
import com.example.CureWell.services.DoctorSpecService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorSpecServiceImpl implements DoctorSpecService {

    private DocterSpecRepository docterSpecRepository;
    private DoctorRepository doctorRepository;
    private SpecialisationRepository specialisationRepository;

    public DoctorSpecServiceImpl(DocterSpecRepository docterSpecRepository,
                                       DoctorRepository doctorRepository,
                                       SpecialisationRepository specialisationRepository) {
        this.docterSpecRepository = docterSpecRepository;
        this.doctorRepository = doctorRepository;
        this.specialisationRepository = specialisationRepository;
    }

    @Override
    public List<DoctorSpec> getAllDoctorSpec() {
        return docterSpecRepository.findAll();
    }

    @Override
    public DoctorSpec addDoctorSpecialization(Long doctorId, String specCode, LocalDate specializationDate) {
        Optional<Doctor> doctor = doctorRepository.findById(doctorId);
        Optional<Specialisation> specialisation = specialisationRepository.findById(specCode);

        if (doctor.isEmpty() || specialisation.isEmpty()) {
            throw new RuntimeException("Doctor or Specialisation not found!");
        }

        DoctorSpec doctorSpecialization = new DoctorSpec(doctor.get(), specialisation.get(), specializationDate);
        return docterSpecRepository.save(doctorSpecialization);
    }
}