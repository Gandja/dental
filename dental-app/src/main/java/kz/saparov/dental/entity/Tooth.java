package kz.saparov.dental.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="teeth")
public class Tooth {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private Long toothId;
	
	@Column(name="tooth_number")
	private int toothNumber;
	
	@Column(name="comment", length=250)
	private String comment;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	@JsonIgnore
	private Patient patient;
	
	public Tooth() {}
	
	public Long getToothId() {
		return toothId;
	}

	public void setToothId(Long toothId) {
		this.toothId = toothId;
	}

	public int getToothNumber() {
		return toothNumber;
	}

	public void setToothNumber(int toothNumber) {
		this.toothNumber = toothNumber;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}
