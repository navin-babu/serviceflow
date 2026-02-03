package com.service.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
public class RepairRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long repairId;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	private String complaintDescription;
	private String remarks;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	public enum Status {
		CREATED,
		ASSIGNED,
		IN_PROGRESS,
		REPAIR_DONE,
		CLOSED
	}
	
	@ManyToOne
	@JoinColumn(name = "technician_id")
	private User technician;
	
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	public Long getRepairId() {
		return repairId;
	}
	public void setRepairId(Long repairId) {
		this.repairId = repairId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getComplaintDescription() {
		return complaintDescription;
	}
	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public User getTechnician() {
		return technician;
	}
	public void setTechnician(User technician) {
		this.technician = technician;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@PrePersist
	public void onCreate() {
		createdAt = LocalDateTime.now();
		status = Status.CREATED;
	}
	
	@PreUpdate
	public void onUpdate() {
		updatedAt = LocalDateTime.now();
	}
	
}
