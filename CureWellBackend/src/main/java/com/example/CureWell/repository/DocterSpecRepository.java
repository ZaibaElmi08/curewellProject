package com.example.CureWell.repository;

import com.example.CureWell.entity.DoctorSpec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DocterSpecRepository extends JpaRepository<DoctorSpec,String> {

}
