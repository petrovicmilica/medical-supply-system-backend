package com.example.isaprojekat.dto;

import com.example.isaprojekat.enums.ReservationStatus;
import com.example.isaprojekat.model.Appointment;
import com.example.isaprojekat.model.Item;
import com.example.isaprojekat.model.Reservation;
import com.example.isaprojekat.model.User;

import java.time.LocalDateTime;
import java.util.Set;

public class ReservationDTO {
    private Integer id;
    //@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private User user;

    private Appointment appointment;

    private Set<Item> items;
    private ReservationStatus status;

    private double totalPrice;

    public ReservationDTO() {

    }

    public ReservationDTO(Reservation reservation) {
        this.id = reservation.getId();
        this.user = reservation.getUser();
        this.appointment = reservation.getAppointment();
        this.items = reservation.getItems();
        this.status = reservation.getStatus();
        this.totalPrice = reservation.getTotalPrice();
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
