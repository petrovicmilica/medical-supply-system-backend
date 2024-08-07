package com.example.isaprojekat.model;

import lombok.*;

@Getter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final String city;
    private final String country;
    private final String phoneNumber;
    private final String occupation;
    private final String companyInfo;

}
