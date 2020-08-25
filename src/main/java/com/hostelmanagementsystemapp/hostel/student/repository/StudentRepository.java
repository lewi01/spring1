package com.hostelmanagementsystemapp.hostel.student.repository;

import com.hostelmanagementsystemapp.hostel.student.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StudentRepository extends PagingAndSortingRepository<Student,Long> {
    List<Student> findAllStudents();
}
