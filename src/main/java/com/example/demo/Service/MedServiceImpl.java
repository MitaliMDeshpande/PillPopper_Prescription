package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Entity.Medicine;
import com.example.demo.Repository.MedicineRepository;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Medicine updateMed(Medicine medicine, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMed(long id) {
		// TODO Auto-generated method stub
		
	}

	

}
