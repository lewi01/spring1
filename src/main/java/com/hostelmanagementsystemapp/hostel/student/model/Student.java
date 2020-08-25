package com.hostelmanagementsystemapp.hostel.student.model;

import javax.persistence.*;

@Entity
@Table(name="student")
@NamedQueries({
        @NamedQuery(name = "Student.findAllStudents",query = "select s from Student s")
})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private Long phoneNumber;
    private String name;
    private Long roomNo;

    public Student() {
    }

    public Student(Long id, Long phoneNumber, String name, Long roomNo) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.roomNo=roomNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Long roomNo) {
        this.roomNo = roomNo;
    }
}
