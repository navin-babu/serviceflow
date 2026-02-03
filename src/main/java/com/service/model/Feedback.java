package com.service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer feedbackId;
	
	@OneToOne
	@JoinColumn(name = "repair_id")
	private RepairRequest repairRequest;
	
	@ManyToOne
	@JoinColumn(name = "technician_id")
	private User technician;
	
	private Integer rating;
	private String comment;
	public Integer getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}
	public RepairRequest getRepairRequest() {
		return repairRequest;
	}
	public void setRepairRequest(RepairRequest repairRequest) {
		this.repairRequest = repairRequest;
	}
	public User getTechnician() {
		return technician;
	}
	public void setTechnician(User technician) {
		this.technician = technician;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
