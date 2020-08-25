package com.hostelmanagementsystemapp.hostel.hostel.api;

import com.hostelmanagementsystemapp.hostel.hostel.model.Hostel;
import com.hostelmanagementsystemapp.hostel.hostel.service.HostelService;
import com.hostelmanagementsystemapp.hostel.pojo.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hostel")
public class HostelApi {
public HostelService hostelService;


    @Autowired
    public HostelApi(HostelService hostelService) {
        this.hostelService = hostelService;
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity CreateHostel(Hostel hostel){
        System.out.println("create Hostel");
        GenericResponse genericResponse = hostelService.saveHostel(hostel);
        return new ResponseEntity(genericResponse, HttpStatus.OK);
    }
}
