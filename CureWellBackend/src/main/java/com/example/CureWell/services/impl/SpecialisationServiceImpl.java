package com.example.CureWell.services.impl;

import com.example.CureWell.entity.Doctor;
import com.example.CureWell.entity.Specialisation;
import com.example.CureWell.repository.DocterSpecRepository;
import com.example.CureWell.repository.DoctorRepository;
import com.example.CureWell.repository.SpecialisationRepository;
import com.example.CureWell.services.SpecialisationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialisationServiceImpl implements SpecialisationService {
    private final SpecialisationRepository specialisationRepository;
    private DocterSpecRepository doctorSpecRepository;
    private DoctorRepository doctorRepository;

    // Constructor Injection
    public SpecialisationServiceImpl(SpecialisationRepository specialisationRepository) {
        this.specialisationRepository = specialisationRepository;
    }

    // Get all specialisations
    @Override
    public List<Specialisation> getAllSpecialisation() {
        return specialisationRepository.findAll();
    }

    // Get specialisation by ID
    @Override
    public Specialisation getSpecialisationById(String specCode) {
        return specialisationRepository.findById(specCode)
                .orElseThrow(() -> new RuntimeException("Specialisation not found with ID: " + specCode));
    }

    // Add a new specialisation
    @Override
    public Specialisation addSpecialisation(Specialisation specialisation) {
        return specialisationRepository.save(specialisation);
    }

    // Update an existing specialisation
    @Override
    public Specialisation updateSpecialisation(String specCode, Specialisation specialisationDetails) {
        Specialisation specialisation = specialisationRepository.findById(specCode)
                .orElseThrow(() -> new RuntimeException("Specialisation not found with ID: " + specCode));

        // Update details
        specialisation.setSpecName(specialisationDetails.getSpecName());
        specialisation.setSpecCode(specialisationDetails.getSpecCode());

        return specialisationRepository.save(specialisation);
    }

    // Delete a specialisation by ID
    @Override
    public void deleteSpecialisation(String specCode) {
        specialisationRepository.deleteById(specCode);
    }


}
