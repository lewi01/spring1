package com.hostelmanagementsystemapp.hostel.student.service;

import com.hostelmanagementsystemapp.hostel.pojo.GenericResponse;
import com.hostelmanagementsystemapp.hostel.student.model.Student;

public interface StudentService {

GenericResponse getStudents();
Student getStudentById(Long id);
GenericResponse saveStudent(Student student);
GenericResponse updateStudent(Student student);

}
