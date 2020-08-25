package com.hostelmanagementsystemapp.hostel.room.service;

import com.hostelmanagementsystemapp.hostel.pojo.GenericResponse;
import com.hostelmanagementsystemapp.hostel.room.model.Room;
import com.hostelmanagementsystemapp.hostel.room.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
    private RoomRepository roomRepository;
    @Autowired
    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public GenericResponse getRooms() {
        return null;
    }

    @Override
    public GenericResponse saveRoom(Room room) {
        Room room1 =roomRepository.save(room);
        if (room1.getRoomNo()>0){
            return new GenericResponse(200,"successful",room);
        }
        return new GenericResponse(200,"NOT FOUND");

    }

    @Override
    public GenericResponse updateRoom(Room room) {
        Room room1 =roomRepository.save(room);
        if (room1.getRoomNo()>0){
            return new GenericResponse(200,"successful",room);
        }
        return new GenericResponse(200,"NOT FOUND");
    }
}
