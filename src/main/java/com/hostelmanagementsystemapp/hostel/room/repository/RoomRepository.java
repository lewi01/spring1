package com.hostelmanagementsystemapp.hostel.room.repository;

import com.hostelmanagementsystemapp.hostel.room.model.Room;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RoomRepository extends PagingAndSortingRepository<Room,Long> {

}
