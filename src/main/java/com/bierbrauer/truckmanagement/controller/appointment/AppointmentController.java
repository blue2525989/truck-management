package com.bierbrauer.truckmanagement.controller.appointment;

import com.bierbrauer.truckmanagement.model.appointment.Appointment;
import com.bierbrauer.truckmanagement.service.appointment.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/appointments")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @GetMapping("")
    public ArrayList<Appointment> get() {
        try {
            return appointmentService.getAppointments();
        } catch (Exception e) {
            // throw it until have better method of handling
            throw e;
        }
    }
}
