package com.hostelmanagementsystemapp.hostel.hostel.model;

import javax.persistence.*;

@Entity
@Table(name = "hostel")
@NamedQueries({
        @NamedQuery(name = "Hostel.showAllHostels",query = "select s from Hostel s")
})
public class Hostel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long noOfRooms;
    private String student;
    private String floor;
    private String type;

    public Hostel(Long noOfRooms, String student, String floor, String type) {
        this.noOfRooms = noOfRooms;
        this.student = student;
        this.floor = floor;
        this.type =type;
    }

    public Long getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(Long noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
