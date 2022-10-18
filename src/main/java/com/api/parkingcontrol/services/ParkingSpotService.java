package com.api.parkingcontrol.services;


import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.stereotype.Service;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

import javax.transaction.Transactional;

@Service
public class ParkingSpotService {


    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }
}
