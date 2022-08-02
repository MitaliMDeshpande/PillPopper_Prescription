package com.example.demo.Dao.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Time;
//import java.sql.Timestamp;
 

@Entity
@Table(name = "medicines")
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column(name = "medName", nullable = false)
	String medName;
	@Column(name = "isSyrup")
	String isSyrup;
	@Column(name = "MorningDosage")
	String MorningDosage;
	@Column(name = "AfternoonDosage")
	String AfternoonDosage;
	@Column(name = "EveningDosage")
	String EveningDosage;
	@Column(name = "NightDosage")
	String NightDosage;
	@Column(name = "Morningtime")
    Time MorningTiming ;
	@Column(name = "Afternoontime")
    Time AfternoonTiming ;
	@Column(name = "Eveningtime")
    Time EveningTiming ;
	@Column(name = "Nighttime")
    Time NightTiming ;
	
	public Medicine() {
		super();
		
	}
	


	public Medicine(String medName, String isSyrup, String morningDosage, String afternoonDosage, String eveningDosage,
			String nightDosage, Time morningTiming, Time afternoonTiming, Time eveningTiming, Time nightTiming) {
		super();
		this.medName = medName;
		this.isSyrup = isSyrup;
		MorningDosage = morningDosage;
		AfternoonDosage = afternoonDosage;
		EveningDosage = eveningDosage;
		NightDosage = nightDosage;
		MorningTiming = morningTiming;
		AfternoonTiming = afternoonTiming;
		EveningTiming = eveningTiming;
		NightTiming = nightTiming;
	}	
	
	
	
	public Time getMorningTiming() {
		return MorningTiming;
	}



	public void setMorningTiming(Time morningTiming) {
		MorningTiming = morningTiming;
	}



	public Time getAfternoonTiming() {
		return AfternoonTiming;
	}



	public void setAfternoonTiming(Time afternoonTiming) {
		AfternoonTiming = afternoonTiming;
	}



	public Time getEveningTiming() {
		return EveningTiming;
	}



	public void setEveningTiming(Time eveningTiming) {
		EveningTiming = eveningTiming;
	}



	public Time getNightTiming() {
		return NightTiming;
	}



	public void setNightTiming(Time nightTiming) {
		NightTiming = nightTiming;
	}



	public String getIsSyrup() {
		return isSyrup;
	}


	public void setIsSyrup(String isSyrup) {
		this.isSyrup = isSyrup;
	}


	public String getMorningDosage() {
		return MorningDosage;
	}


	public void setMorningDosage(String morningDosage) {
		MorningDosage = morningDosage;
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


	public String getMorningdosage() {
		return MorningDosage;
	}

	public void setMorningdosage(String morningdosage) {
		MorningDosage = morningdosage;
	}

	public String getAfternoonDosage() {
		return AfternoonDosage;
	}

	public void setAfternoonDosage(String afternoonDosage) {
		AfternoonDosage = afternoonDosage;
	}

	public String getEveningDosage() {
		return EveningDosage;
	}

	public void setEveningDosage(String eveningDosage) {
		EveningDosage = eveningDosage;
	}

	public String getNightDosage() {
		return NightDosage;
	}

	public void setNightDosage(String nightDosage) {
		NightDosage = nightDosage;
	}

}
