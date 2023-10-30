package com.Snigdha.Snigdha.controller;

import com.Snigdha.Snigdha.dao.PatientRepository;
import com.Snigdha.Snigdha.models.Doctor;
import com.Snigdha.Snigdha.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// import java.util.List;

@Controller
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping(path = "/patients") // url path
    public String getDoctors(Model model) {
        patientRepository.createPatientTable();
        model.addAttribute(/* object used in html page */"patients", patientRepository.showAllPatients());
        return "patients"; // html page
    }

    @RequestMapping(value = "/addpatient", method = RequestMethod.GET)
    public String addPatientget(Model model) {
        return "addpatient";
    }

    @RequestMapping(value = "/addpatient", method = RequestMethod.POST)
    public String addPatient(Patient patient) {
        patientRepository.createPatient(patient);
        return "success";
    }

    @RequestMapping(value = "/cancelpatient", method = RequestMethod.GET)
    public String cancelPatientget(Model model) {
        return "cancelpatient";
    }

    @RequestMapping(value = "/cancelpatient", method = RequestMethod.POST)
    public String cancelPatientpost(Patient patient) {
        patientRepository.cancelPatient(patient.getPatientId());
        return "success";
    }
}

