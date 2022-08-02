package com.example.demo.Service;
import java.util.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Entity.Medicine;
import com.example.demo.Repository.MedicineRepository;
import com.example.demo.exception.ResourceNotFoundException;


@Service
public class MedServiceImpl implements MedService{
	@Autowired
	MedicineRepository medRepo;
	
	public MedServiceImpl(MedicineRepository medRepo) {
		super();
		this.medRepo = medRepo;
	}
	
	@Override
	public Medicine saveMed(Medicine medicine) {
		// TODO Auto-generated method stub
		return medRepo.save(medicine);
	}

	@Override
	public List<Medicine> getAllMedicines() {
		// TODO Auto-generated method stub
		return medRepo.findAll();
	}

	@Override
	public Medicine getMedById(long id) {
		Optional<Medicine> med = medRepo.findById(id);
		if(med.isPresent()) {
			return med.get();
		}else {
			throw new ResourceNotFoundException("Medicine", "Id", id);
		}
		//return medRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Medicine", "Id", id));
	}

	@Override
	public Medicine updateMed(Medicine medicine, long id) {
		Optional<Medicine> med = medRepo.findById(id);
		if(med.isPresent()) {
			Medicine medicine1= med.get();
			medicine1.setMedName(medicine.getMedName());
			medicine1.setMorningdosage(medicine.getMorningdosage());
			medicine1.setAfternoonDosage(medicine.getEveningDosage());
			medicine1.setEveningDosage(medicine.getEveningDosage());
			medicine1.setNightDosage(medicine.getNightDosage());
			medicine1.setMorningTiming(medicine.getMorningTiming());
			medicine1.setAfternoonTiming(medicine.getAfternoonTiming());
			medicine1.setEveningTiming(medicine.getEveningTiming());
			medicine1.setNightTiming(medicine.getNightTiming());
			medRepo.save(medicine1);
			return medicine1;
		}else {
			throw new ResourceNotFoundException("Medicine", "Id", id);
		}
		
	}

	@Override
	public void deleteMed(long id) {
		Optional<Medicine> med = medRepo.findById(id);
		if(med.isPresent()) {
			medRepo.deleteById(id);
		}else {
			throw new ResourceNotFoundException("Medicine", "Id", id);
		}
		
	}

	

}
