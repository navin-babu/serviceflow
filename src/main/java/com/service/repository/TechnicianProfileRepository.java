package com.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.model.TechnicianProfile;

@Repository
public interface TechnicianProfileRepository extends JpaRepository<TechnicianProfile, Long> {

}
