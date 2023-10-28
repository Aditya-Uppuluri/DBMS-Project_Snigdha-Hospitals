package com.Snigdha.Snigdha.controller;

import com.Snigdha.Snigdha.dao.AppointmentRepository;
import com.Snigdha.Snigdha.models.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppointmentController {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @GetMapping(path = "/appointments") // url path
    public String getDoctors(Model model) {
        appointmentRepository.createAppointmentTable();
        model.addAttribute(/* object used in html page */"appointments", appointmentRepository.showAllAppointments());
        return "appointments"; // html page
    }

    @RequestMapping(value = "/addappointment", method = RequestMethod.GET)
    public String addAppointmentget(Model model) {
        return "addappointment";
    }

    @RequestMapping(value = "/addappointment", method = RequestMethod.POST)
    public String addAppointmentpost(Appointment appointment) {
        appointmentRepository.createAppointment(appointment);
        return "success";
    }

    @RequestMapping(value = "/cancelappointment", method = RequestMethod.GET)
    public String cancelAppointmentget(Model model) {
        return "cancelappointment";
    }

    @RequestMapping(value = "/cancelappointment", method = RequestMethod.POST)
    public String cancelAppointmentpost(Appointment appointment) {
        appointmentRepository.cancelAppointment(appointment.getAppointmentId());
        return "success";
    }

}
