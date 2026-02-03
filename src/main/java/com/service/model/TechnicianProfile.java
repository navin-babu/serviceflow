package com.service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class TechnicianProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long techProfileId;  
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	private String specializedCategory;
	private Double averageRating = 0.0;
	private Integer totalRepairs = 0;

	public Long getTechProfileId() {
		return techProfileId;
	}
	public void setTechProfileId(Long techProfileId) {
		this.techProfileId = techProfileId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getSpecializedCategory() {
		return specializedCategory;
	}
	public void setSpecializedCategory(String specializedCategory) {
		this.specializedCategory = specializedCategory;
	}
	public Double getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}
	public Integer getTotalRepairs() {
		return totalRepairs;
	}
	public void setTotalRepairs(Integer totalRepairs) {
		this.totalRepairs = totalRepairs;
	}
}
