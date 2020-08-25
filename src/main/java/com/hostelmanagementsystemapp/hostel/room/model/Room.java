package com.hostelmanagementsystemapp.hostel.room.model;


import javax.persistence.*;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String student;
    private Long noOfOccupants;
    private String roomType;
    private Long roomNo;

    public Room( String student, Long noOfOccupants, String roomType, Long roomNo) {
        this.student = student;
        this.noOfOccupants = noOfOccupants;
        this.roomType = roomType;
        this.roomNo = roomNo;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public Long getNoOfOccupants() {
        return noOfOccupants;
    }

    public void setNoOfOccupants(Long noOfOccupants) {
        this.noOfOccupants = noOfOccupants;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Long getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Long roomNo) {
        this.roomNo = roomNo;
    }
}
