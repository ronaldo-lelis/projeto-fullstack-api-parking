package com.fullstack.api_parking.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fullstack.api_parking.models.ParkingSpotModel;
import com.fullstack.api_parking.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;

@Service
public class ParkingSpotService {
	
	@Autowired
	ParkingSpotRepository parkingSpotRepository;
	
	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}

	public boolean existsByLicensePlatecar(String licensePlateCar) {
		// TODO Auto-generated method stub
		return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
	}

	public boolean existsByPakingSpotNumber(String parkingSpotNumber) {
		// TODO Auto-generated method stub
		return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
	}

	public boolean existsByApartmentAndBlock(String apartment, String block) {
		// TODO Auto-generated method stub
		return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
	}

	public Page<ParkingSpotModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return parkingSpotRepository.findAll(pageable);
	}

	public Optional<ParkingSpotModel> findById(UUID id) {
		// TODO Auto-generated method stub
		return parkingSpotRepository.findById(id);
	}

	@Transactional
	public void delete(ParkingSpotModel parkingSpotModel) {
		// TODO Auto-generated method stub
		parkingSpotRepository.delete(parkingSpotModel);		
	}
	
	
	
	
	

}
