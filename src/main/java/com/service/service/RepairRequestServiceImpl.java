package com.service.service;

import org.springframework.stereotype.Service;

import com.service.repository.RepairRequestRepository;

@Service
public class RepairRequestServiceImpl implements RepairRequestService {
	
	RepairRequestRepository repairRequestRepository;
	public RepairRequestServiceImpl(RepairRequestRepository repairRequestRepository) {
		this.repairRequestRepository = repairRequestRepository;
	}
}
