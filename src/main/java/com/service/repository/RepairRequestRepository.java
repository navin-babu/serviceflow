package com.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.model.RepairRequest;

@Repository
public interface RepairRequestRepository extends JpaRepository<RepairRequest, Long> {

}
