package com.example.CureWell.repository;

import com.example.CureWell.entity.Doctor;
import com.example.CureWell.entity.Specialisation;
import com.example.CureWell.entity.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SpecialisationRepository extends JpaRepository<Specialisation,String> {
    
}
