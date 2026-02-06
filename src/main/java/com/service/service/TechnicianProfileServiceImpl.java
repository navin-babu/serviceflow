package com.service.service;

import org.springframework.stereotype.Service;

import com.service.repository.TechnicianProfileRepository;

@Service
public class TechnicianProfileServiceImpl implements TechnicianProfileService{
	
	TechnicianProfileRepository technicianProfileRepository;
	public TechnicianProfileServiceImpl(TechnicianProfileRepository technicianProfileRepository) {
		this.technicianProfileRepository = technicianProfileRepository;
	}

}
