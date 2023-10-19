package com.Snigdha.Snigdha.controller;


import com.Snigdha.Snigdha.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @Autowired
    JdbcTemplate jdbcTemplate;
//    @Autowired
//    private DoctorRepository doctorRepository;


//    @GetMapping("/doctors")
//    public String getDoctors(Model model){
//////        Doctor[] doctors = doctorService.getDoctors();
////        Doctor[] doctors = {new Doctor(1,"Vignesh","MD","Ortho",300,94449494)};
////        model.addAttribute("doctors",doctors);
//        return "doctors";
//    }

    @GetMapping("/adddoctor")
    public String addDoctors(){
        return "adddoctor";
    }

    @PostMapping("/adddoctors")
    public String addDoctor(Doctor doctor){
        String sql_query = "INSERT INTO doctor (name,qualification,department,fees,phone) VALUES (?,?,?,?,?)";
        jdbcTemplate. update(sql_query,
                doctor.getDoctorName(),
                doctor.getDoctorQualification(),
                doctor.getDoctorDepartment(),
                doctor.getDoctorFees(),
                doctor.getDoctorPhone()
        );
        return "success";
    }


}