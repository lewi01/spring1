package com.hostelmanagementsystemapp.hostel.student.api;

import com.hostelmanagementsystemapp.hostel.pojo.GenericResponse;
import com.hostelmanagementsystemapp.hostel.student.model.Student;
import com.hostelmanagementsystemapp.hostel.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentApi {
private StudentService studentService;

    @Autowired
    public StudentApi(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public ResponseEntity getAllStudent(){
        System.out.println("get all student from DB");
        GenericResponse genericResponse = studentService.getStudents();
        return new ResponseEntity(genericResponse, HttpStatus.OK);
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity CreateStudent(@RequestBody Student student){
        System.out.println("create student");
        GenericResponse genericResponse = studentService.saveStudent(student);
        return new ResponseEntity<>(genericResponse, HttpStatus.OK);
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ResponseEntity updateStudent(@RequestBody Student student){
        System.out.println("update student");
        GenericResponse genericResponse = studentService.updateStudent(student);
        return new ResponseEntity(genericResponse, HttpStatus.OK);
    }

}
