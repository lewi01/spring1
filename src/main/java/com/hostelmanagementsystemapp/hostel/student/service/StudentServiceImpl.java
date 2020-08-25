package com.hostelmanagementsystemapp.hostel.student.service;

import com.hostelmanagementsystemapp.hostel.pojo.GenericResponse;
import com.hostelmanagementsystemapp.hostel.student.model.Student;
import com.hostelmanagementsystemapp.hostel.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public GenericResponse getStudents() {
        List<Student> students = studentRepository.findAllStudents();
        if (students.size()>0){
        return  new GenericResponse(200,"successful",students);
        }
        return new GenericResponse(200,"Not found");
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public GenericResponse saveStudent(Student student) {
    Student student1 =studentRepository.save(student);
    if (student1.getId()>0){
    return new GenericResponse(200,"successful",student1);
    }
        return new GenericResponse(200,"Not found");
    }

    @Override
    public GenericResponse updateStudent(Student student) {
        Student student1 = studentRepository.save(student);
        if (student1.getId()>0){
            return new GenericResponse(200,"successful",student1);
        }
        return new GenericResponse(200,"Not found");
    }
}
