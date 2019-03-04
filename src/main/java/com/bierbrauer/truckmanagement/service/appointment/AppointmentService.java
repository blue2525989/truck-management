package com.bierbrauer.truckmanagement.service.appointment;

import com.bierbrauer.truckmanagement.model.appointment.Appointment;
//import com.bierbrauer.truckmanagement.repository.appointment.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service(value = "AppointmentService")
public class AppointmentService {

    @Autowired
//    AppointmentRepository appointmentRepository;

    public ArrayList<Appointment> getAppointments() {
        ArrayList<Appointment> appointments = new ArrayList<>();

        Appointment apt1 = new Appointment("Apt 1", "test 1");
        Appointment apt2 = new Appointment("Apt 2", "test 2");

        appointments.add(apt1);
        appointments.add(apt2);

        return appointments;

//        return appointmentRepository.findAll();
    }

}
