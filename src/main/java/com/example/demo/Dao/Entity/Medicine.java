package com.example.demo.Dao.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "medicines")
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column(name = "medName", nullable = false)
	String medName;
	@Column(name = "dosage", nullable = false)
	String dosage;
	@Column(name = "time", nullable = false)
	String time;

	
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicine(String medName, String dosage, String time) {
		super();
		this.medName = medName;
		this.dosage = dosage;
		this.time = time;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMedName() {
		return medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", medName=" + medName + ", dosage=" + dosage + ", time=" + time + "]";
	}

}
