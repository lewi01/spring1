package com.hostelmanagementsystemapp.hostel.room.service;

import com.hostelmanagementsystemapp.hostel.pojo.GenericResponse;
import com.hostelmanagementsystemapp.hostel.room.model.Room;

public interface RoomService {
    GenericResponse getRooms();
    GenericResponse saveRoom(Room room);
    GenericResponse updateRoom(Room room);

}
