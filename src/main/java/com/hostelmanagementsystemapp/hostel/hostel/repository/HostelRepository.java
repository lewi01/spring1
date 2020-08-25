package com.hostelmanagementsystemapp.hostel.hostel.repository;

import com.hostelmanagementsystemapp.hostel.hostel.model.Hostel;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface HostelRepository extends PagingAndSortingRepository<Hostel,Long> {

    List<Hostel> showAllHostels();
}
