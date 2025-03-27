package com.example.CureWell.services;

import com.example.CureWell.entity.Doctor;
import com.example.CureWell.entity.Specialisation;

import java.util.List;

public interface SpecialisationService {
    List<Specialisation> getAllSpecialisation();
    Specialisation getSpecialisationById(String specCode);
    Specialisation addSpecialisation(Specialisation specialisation);
    Specialisation updateSpecialisation(String specCode, Specialisation specialisation);
    void deleteSpecialisation(String specCode);
//    List<Doctor> getDoctorsBySpecialisation(String specCode);
}
