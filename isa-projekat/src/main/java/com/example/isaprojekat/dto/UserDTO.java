package com.example.isaprojekat.dto;

import com.example.isaprojekat.enums.UserRole;
import com.example.isaprojekat.model.User;

public class UserDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private Double penaltyPoints;
    private UserRole userRole;
    private String city;
    private String country;
    private String phoneNumber;
    private String occupation;
    private String companyInfo;

    public UserDTO() {

    }

    public UserDTO(User user) {
        this(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getPenaltyPoints(),
                user.getUserRole(),
                user.getCity(),
                user.getCountry(),
                user.getPhoneNumber(),
                user.getOccupation(),
                user.getCompanyInfo()
        );
    }

    public UserDTO(Integer id, String firstName, String lastName, Double penaltyPoints, UserRole userRole,
                   String city, String country, String phoneNumber, String occupation, String companyInfo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.penaltyPoints = penaltyPoints;
        this.userRole = userRole;
        this.city = city;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.occupation = occupation;
        this.companyInfo = companyInfo;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getPenaltyPoints() {
        return penaltyPoints;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getCompanyInfo() {
        return companyInfo;
    }
}
