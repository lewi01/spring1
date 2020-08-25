package com.hostelmanagementsystemapp.hostel.hostel.service;

import com.hostelmanagementsystemapp.hostel.hostel.model.Hostel;
import com.hostelmanagementsystemapp.hostel.pojo.GenericResponse;
import com.hostelmanagementsystemapp.hostel.room.model.Room;

public interface HostelService {
    GenericResponse getAllHostels();
    GenericResponse saveHostel(Hostel hostel);
    GenericResponse updateHostel(Hostel hostel);

}
