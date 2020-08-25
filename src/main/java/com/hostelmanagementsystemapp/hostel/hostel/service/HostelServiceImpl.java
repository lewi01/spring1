package com.hostelmanagementsystemapp.hostel.hostel.service;

import com.hostelmanagementsystemapp.hostel.hostel.model.Hostel;
import com.hostelmanagementsystemapp.hostel.hostel.repository.HostelRepository;
import com.hostelmanagementsystemapp.hostel.pojo.GenericResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostelServiceImpl implements HostelService {
    private HostelRepository hostelRepository;

    public HostelServiceImpl(HostelRepository hostelRepository) {
        this.hostelRepository = hostelRepository;
    }

    @Override
    public GenericResponse getAllHostels() {
        List<Hostel> hostels = hostelRepository.showAllHostels();
        if (hostels.size()>0){
            return new GenericResponse(200,"Displaying",hostels);
        }
        return new GenericResponse(200,"NOT FOUND");
    }

    @Override
    public GenericResponse saveHostel(Hostel hostel) {
        Hostel hostel1 =hostelRepository.save(hostel);
        if (hostel1.getNoOfRooms()>0){
            return new GenericResponse(200,"Displaying",hostel);
        }
        return new GenericResponse(200,"NOT FOUND");
    }

    @Override
    public GenericResponse updateHostel(Hostel hostel) {
        Hostel hostel1 =hostelRepository.save(hostel);
        if (hostel1.getNoOfRooms()>0){
            return new GenericResponse(200,"Displaying",hostel);
        }
        return new GenericResponse(200,"NOT FOUND");
    }
}
