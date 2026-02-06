package com.service.service;

import org.springframework.stereotype.Service;

import com.service.repository.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	
	FeedbackRepository feedbackRepository;
	public FeedbackServiceImpl(FeedbackRepository feedbackRepository) {
		this.feedbackRepository = feedbackRepository;
	}
	
}
