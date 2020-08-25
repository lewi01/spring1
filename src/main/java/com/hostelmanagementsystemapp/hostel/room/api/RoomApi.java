package com.hostelmanagementsystemapp.hostel.room.api;

import com.hostelmanagementsystemapp.hostel.pojo.GenericResponse;
import com.hostelmanagementsystemapp.hostel.room.model.Room;
import com.hostelmanagementsystemapp.hostel.room.service.RoomService;
import com.hostelmanagementsystemapp.hostel.student.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RoomApi {
    private RoomService roomService;

    public RoomApi(RoomService roomService) {
        this.roomService = roomService;
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public ResponseEntity getAllRooms(){
        System.out.println("get all rooms from DB");
        GenericResponse genericResponse = roomService.getRooms();
        return new ResponseEntity(genericResponse, HttpStatus.OK);
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity CreateStudent(Room room){
        System.out.println("create room");
        GenericResponse genericResponse = roomService.saveRoom(room);
        return new ResponseEntity(genericResponse, HttpStatus.OK);
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ResponseEntity updateStudent(Room room){
        System.out.println("update room");
        GenericResponse genericResponse = roomService.updateRoom(room);
        return new ResponseEntity(genericResponse, HttpStatus.OK);
    }

}
